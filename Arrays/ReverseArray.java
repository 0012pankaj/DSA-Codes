class solution{
    public static void reverse(int array[],int s,int l){
        while (s<l) {
            int temp=array[s];
            array[s]=array[l];
            array[l]=temp;
            s++;
            l--;
        }
       
    }
}