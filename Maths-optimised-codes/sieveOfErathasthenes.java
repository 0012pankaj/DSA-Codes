import java.util.Arrays;

public class sieveOfErathasthenes {
    // this algoritham is use to find prime number upto n with the help of array

    static void givePrime(int n) {
        boolean isprime[] = new boolean[n + 1];
        Arrays.fill(isprime, true);
        for (int i = 2; i <= n; i++) {
            if (isprime[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j=j+i) {
                    isprime[j] = false;
                }
            }
        }
        // for (int i = 2; i < n; i++) {
        //     if (isprime[i]) {
        //         System.out.print(i + " ");
        //     }
        // }                                //////2 3 5 7 
    }

    public static void main(String[] args) {
        int n = 9;
        givePrime(n);
    }
}
