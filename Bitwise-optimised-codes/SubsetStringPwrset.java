public class SubsetStringPwrset {
  static  String  s = "abc";            //in this we find sub set of number with the help of ninary number
  static void   givesubset(String s){
    int n=s.length();
    double powersiz=Math.pow(2.0,(double) n);
    for (int i = 0; i < (int)powersiz; i++) {
        for (int j = 0; j < n; j++) {
            if((i & (1<<j) )!=0){
                System.out.print(s.charAt(j));
            }
            
        }
        System.out.println();
        
    }
  }
  public static void main(String[] args) {
    givesubset(s);
  }
}
