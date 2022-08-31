public class findOddoccur {
    //in this program we find that 1 no. that come odd no of times(with thehelp of ^ using property [x^x=0][x^0=x])
    static int giveOddcome(int arry[]){
        int result=0;
        for (int i = 0; i < arry.length; i++) {
            result=(result ^ arry[i]) ;   // [x^x=0][x^0=x]
        }
        return result;
    }
    public static void main(String[] args) {
        int arry[]={8,7,7,8,8,3,3};
        System.out.println(giveOddcome(arry)); //8
    }      // TC-->0(n)
}
