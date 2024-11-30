/** A library of operations on arrays of characters (char values).
 *  The library also features a string comparison method. */
public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  // Prints the string
        println(arr1);            // Prints an array of characters
        System.out.println(charAt(arr1,2));      //good
        System.out.println(indexOf(arr1,'l'));  //good
        System.out.println(indexOf(arr1,'l',3)); //good 
        System.out.println(lastIndexOf(arr1, 'l')); //G
        System.out.println(concat(arr1, arr2)); //G
        System.out.println(subArray(arr2, 2, 9));//G
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(compareTo("abc", "aBc")); // 1
        System.out.println(compareTo("abc", "abcd")); // -1
        System.out.println(compareTo("abc", "")); //-2
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    /** Prints the given array of characters, and moves the cursor to the next line.
     */
    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    /** Returns the char value at the specified index. Assume that the array is non-empty.
     */
    public static char charAt(char[] arr, int index) {
        char at = arr[index];
        return at;
    }

    /** If the two arrays have the same value in every index, 
     *  returns true; Otherwise returns false.
     */
    public static boolean equals(char[] arr1, char[] arr2) {
        boolean isEquals = true;
        if (arr1. length != arr2. length) {
            return false;
        }
        int i = 0;
        while ((isEquals) && (i < arr1.length)) {
            if (arr1[i] != arr2[i]) {
                isEquals = false;
            }
            i++;
        }
        return isEquals;
    }

    /** Returns the index within the given array of the first occurrence of the given character.
     *  If no such character is found, returns -1.
     */
    public static int indexOf(char[] arr, char ch) {
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    /** Same as indexOf(char[], char), but starts the search in the given index.
     */
    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for (int i =fromIndex; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    /** Returns the index within the given arr of the last occurrence of the given character.
     *  If no such character is found, returns -1.
     */
    public static int lastIndexOf(char[] arr, char ch) {
        int index = -1;
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == ch) {
                index = i;
            }
        }
        return index;
    }

    /* Returns an array which is the concatanation of the two given arrays.
    */
    public static char[] concat(char[] arr1, char[] arr2) {
        int newLength = arr1.length + arr2.length;
        char [] concatArr = new char [newLength]; 
        int count1 = 0;
        for (int i = 0; i < arr1.length; i ++) {
            concatArr[i] = charAt(arr1, i);
            count1++;
        }
        for (int j = 0; j < arr2.length; j++) {
            concatArr[count1 + j] = charAt(arr2, j);
        }
        return concatArr;
    }

    /** Returns a new array that can be described as a sub-array of this array.
     *  The sub-array begins at the specified beginIndex and extends to the character at index endIndex - 1.
     *  For example, if arr contains the characters "hamburger", then subArray(4, 8) returns an array of
     *  characters containing the characters "urge".
     */     
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char [] subArray = new char [endIndex - beginIndex];
        int i = beginIndex;
        int j = 0; 
        while (j < subArray.length) {
            subArray[j] = charAt(arr, i);
            i++;
            j++;
        }
        return subArray;
    }

     /** Returns a single integer that represents the given array. This integer is sometimes 
     *  referred to as the array's "hash code". Later in the course we'll explain what these 
     *  hash codes are used for. For now, simply implement the specification given below.
     *  The hash code is computed as: arr[0]*7^(n-1) + arr[1]*7^(n-2) + ... + arr[n-2]*7 + arr[n-1]
     *  where arr[i] is the i'th character of the array, and n is the array's length.
     *  The hash value of an empty array is zero.
     */
    public static long hashCode(char[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int hashCode = 0;
        int n = arr.length; 
        for (int i=0; i < n; i++) {
            hashCode += arr[i] * (int) (Math.pow(7.0, n - (i+1)));
        }
        return hashCode;
    }

    /**
     * Compares the two strings lexicographically.
     * Assume that both strings are not empty.
     * 
     * Characters are compared one by one from left to right, using their numeric Unicode values,
        as follows:
     * 1. If two characters at the same position in both strings are different,
     *    the string with the smaller character is considered lexicographically smaller.
     * 2. If all characters in the shorter string match the corresponding characters
     *    in the longer string, the shorter string is considered lexicographically smaller.
     * 3. If both strings have the same characters and the same length, they are considered equal.
     * 
     * Examples:
     * - "apple" is less than "banana" because 'a' comes before 'b'.
     * - "abc" is less than "abcd" because it is shorter.
     * - "hello" is equal to "hello".
     * - "date" is greater than "dark" because 't' comes after 'k'.
     * 
     * @param str1 the first string to compare
     * @param str2 the second string to compare
     * @return -1 if str1 is lexicographically less than str2,
     *         zero if they are equal, and 1 if str1 is
     *         lexicographically greater than str2.
     *         return -2 if there is an error with the input.
     */
    public static int compareTo(String str1, String str2) {
        if (str1 == "" || str2 == "") {
            return -2;
        }
        char[] str1Arr = new char [str1.length()]; //turning str1 to arr
        for (int i=0; i < str1.length(); i++) {
            str1Arr[i] = str1.charAt(i);
        }
        char[] str2Arr = new char [str2.length()]; //turning str2 to arr
        for (int i=0; i < str2.length(); i++) {
            str2Arr[i] = str2.charAt(i);
        }
        int shorter = 0; //holds which str is shorter
        int shorterLength = 0;
        if (str1Arr.length < str2Arr.length) {
            shorter = -1;
            shorterLength = str1Arr.length;
        } 
        if (str1Arr.length == str2Arr.length) {
            shorter = 0;
            shorterLength = str2Arr.length;
        }
        if (str1Arr.length > str2Arr.length) {
            shorter = 1;
            shorterLength = str2Arr.length;
        }
        int lexi = 0; 
        for (int j=0; j < shorterLength; j++) {
            if ((str1Arr[j] >= 'A') && (str1Arr[j] <= 'Z') && (str2Arr[j] >= 'a') && (str2Arr[j] <= 'z')) {
                    return -1;
                }
            if ((str1Arr[j] >= 'a') && (str1Arr[j] <= 'z') && (str2Arr[j] >= 'A') && (str2Arr[j] <= 'Z')) {
                    return 1;
            }
            if (str1Arr[j] < str2Arr[j]) {
                return -1;
            }
            if (str1Arr[j] > str2Arr[j]) {
                return 1;
            }
        }
        if (shorter != 0) {
            lexi = shorter;
        }
        return lexi;
    }
}
