



public class MyString {
    public static void main(String[] args) {
        /*System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase")); 
        System.out.println("" + lowerCase(""));
        System.out.println("EaSy PeAsY LeMoN SqUeEzy : " + lowerCase("easy peasy lemon squeezy"));
        System.out.println("i love infi and intro : " + lowerCase("i love infi and intro")); */
        System.out.println("The team showed great Synergy in the last project : " + lowerCase("The team showed great Synergy in the last project"));
        

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false 
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true 
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true 
        System.out.println(contains("baba yaga", "baba")); // true
        System.out.println(contains("baba yaga", "")); // 
        System.out.println(contains("baba yaga", "John Wick is the baba yaga")); //false
        System.out.println(contains("baba yaga", "Yaga"));  //ok
        System.out.println(contains("baba yaga", "babayaga")); //false */
        System.out.println(contains("We need to leverage our core competencies", "synergy")); 
        System.out.println(contains("This blockchain-based solution will disrupt the industry", "disrupt"));
        System.out.println(contains("The team showed great synergy in the last project", "synergy"));

    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {  
        int i =0;
        String ans = "";
        while ( i < str.length()) {
            char c = (char) (str.charAt(i));
            if (c == 32) {
                ans = ans + "";
            }
            if ((c >= 97) && (c <= 122)) { 
                ans = ans + c;
                i++;
            } 
            else {
                if ((c >= 65) && (c <= 90)) { 
                    c = (char) (c+32);
                    ans = ans + c;
                    i++;
                } else {
                    i++;
                    ans = ans +c;
                }
            } 
        }
        return ans;
    }




    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false; 
        }
        char[] str1Arr = new char [str1.length()]; 
        for (int i=0; i < str1.length(); i++) {
            str1Arr[i] = str1.charAt(i);
        }
        char[] str2Arr = new char [str2.length()]; 
        for (int i=0; i < str2.length(); i++) {
            str2Arr[i] = str2.charAt(i);
        }

        for (int p = 0; p <= str1Arr.length - str2Arr.length; p++) {
            boolean matches = true;
            for (int j = 0; j < str2Arr.length; j++) {
                if (str2Arr[j] != str1Arr[p + j]) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                return true;
            }
        }
        return false;
    }
}













































      /*   boolean contains1 = false;
        int j = 0;
        int p = 0;
        while (p <= str1Arr.length - str2Arr.length) {
                j=0;
                contains1 = true;
                for (int k = p; k < p + str2Arr.length; k++) {
                    if (str2Arr[j] != str1Arr[k]) {
                        contains1 = false;
                        break;
                        }
                    j++;
                } 
                if (contains1) {
                    return true;
                }
                p++;
            }
            return false;
        }
    }







            /*  if (str2Arr[j] == str1Arr[k]) {
                    contains = true;
                    p = k + 1;
                    j++;
                    System.out.println(p);
                    System.out.println(j);
                    break;
                }
                if (str2Arr[j] != str1Arr[k]) {
                    System.out.println("not equal");
                    contains = false;
                    break;
                }
                System.out.println(contains);
                }
                System.out.println("out of for");
                if (p > str2Arr.length + 1) {
                    break;
                }
        
        }
        return contains; /* */ 

    //("historical", "story")); // false