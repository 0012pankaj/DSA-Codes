public class CheckpowOf2 {
    // in this we check the number have only power of 2 (use method of & (n-1))
    static boolean checkP2(int n) {
        if (n == 0)
            return false;

        return ((n & (n - 1)) == 0);

    }           // tc-->o(1)

    public static void main(String[] args) {
        int n = 9;
        System.out.println(checkP2(n));
    }
}
