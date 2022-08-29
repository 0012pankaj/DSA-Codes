public class trailingZero {
    static long trZero(int n){
        long res=0;
        for(int i=5;i<=n ;i=i*5){
            res=res+(n/i);
        }


        return res;
    }
    public static void main(String[] args) {
        int n=251;                                     //Trailling zero--> zeros at the last of  factorial number after finding factorial
        System.out.println(trZero( n));
    }
}
