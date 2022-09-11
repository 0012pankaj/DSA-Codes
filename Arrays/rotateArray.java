class Solution { // rotation in right  and samr aproch for left only change input of reverse
    public void rotate(int[] nums, int k) {
        
        int len =nums.length; 
        if(len<=1){
            return;
        }
         k = k% len;  // if k > size of array
        reverseArray(nums,len-k,len-1);
         reverseArray(nums,0,len-k-1);
        reverseArray(nums,0,len-1);
               
    }
       public static void reverseArray(int array[],int s,int l){
        while (s<l) {
            int temp=array[s];
            array[s]=array[l];
            array[l]=temp;
            s++;
            l--;
        }
    }
}