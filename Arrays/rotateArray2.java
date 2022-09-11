public class rotateArray2 {  //left rotate aproch
   public static void Rotate_arry(int arry[],int k){
    int n= arry.length;
    int temp[]=new int[n];
    for (int i = 0; i < n; i++) {
        temp[(i+k)%n]=arry[i];
        
    }
    for (int i = 0; i < temp.length; i++) {
        arry[i]=temp[i];
    }
   }
    public static void main(String[] args) {
        int arry[]={1,2,3,4,5};
        Rotate_arry(arry,1);
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
    }
}
