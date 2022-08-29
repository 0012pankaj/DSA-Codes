public class powerofx {                                         // THERE ARE TTWO TYPES TO FIND POWER IN EFFICENT WAY 
                                                                       //1.recursive method of n/2 and odd &even      //2,by itrative or binary exponention
    static int givePower(int x, int n) {
        if (n == 0)
            return 1;
        int temp = givePower(x, n / 2);
        temp = temp * temp;

        if (n % 2 != 0) {
            return temp * x;
        } else {
            return temp;                       //Tc--->log(n)

        }

    }                                                   //243

    public static void main(String[] args) {
        int x = 3, n = 5;
        System.out.println(givePower(x, n));
    }
}
