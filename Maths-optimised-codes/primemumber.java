public class primemumber {
    static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) { // i*i--->root
            if (n % i == 0 || n % (i + 2) == 0) {                                                 // Three time faster than ROOT(N)
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 11;
        if (checkPrime(n)) {
            System.out.println("it is Prime number");
        } else {
            System.out.println("it is NOT a Prime number");
        }
    }
}
