
import java.util.Arrays;


public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[N + 1]; //intialized to false
        Arrays.fill(isPrime, 2, isPrime.length, true);
        int count = 0;
        int p = 2; 
        int sqrtN = (int) (Math.sqrt(N));
        System.out.println("Prime numbers up to " + N + ":");
        while (p <= sqrtN) {
            for (int i = 3; i < isPrime.length; i++) {
            if ((i % p ) == 0 && (i != p)) {
                isPrime[i] = false;
                }
            }
            p++;
        }
        for (int j = 0; j < isPrime.length; j++) {
            if (isPrime[j] == true) {
                System.out.println(j);
                count++;
            }
        }
        double per = ((double)count / N) * 100; 
        System.out.println("There are " + count + " primes between 2 and " + N + ". (" + (int) (per) + "% are primes)"); 
    }
}