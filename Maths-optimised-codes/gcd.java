public class gcd {
    static int greatesComDeviser(int a, int b) {
        if (b == 0)
            return a;
                                                                        
        return greatesComDeviser(b, a % b);                              // log(min(a,b)) --->TC    // Euclis algoritham

    }

    public static void main(String[] args) {
        int a = 12, b = 15;
        System.out.println(greatesComDeviser(a, b));
    }
}
