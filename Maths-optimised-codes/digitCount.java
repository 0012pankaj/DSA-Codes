public class digitCount{

    // dc1-->recursion
    static int dc1(int n){
        if(n==0){
            return 0;
        }

        return 1+ dc1(n/10);
    }

    //dc2-->math function
    static double dc2(int n){
        double x=n;
        return (Math.floor(Math.log10(x))+1);
    }
    public static void main(String[] args) {
        int n =1234;
        System.out.println("no of digit = "+dc1( n));
        System.out.println("no of digit = "+dc2( n));
    }
}