

    
    
    ///Greek of Greek
    class Solution
    {
        //Function to find the smallest positive number missing from the array.
        static int missingNumber(int arr[], int size)
        {
           int  brr[]=new int[1000003];
             
           
           for(int i=0; i<size ;i++)
           {  if(arr[i]>0)
              {
                  brr[arr[i]]=1;
              }
              
           }
           int i=1;
           for( ;i<1000003;i++)
           {
               if(brr[i]!=1)
               {
                  break;
               }
          
            }
          return i;
        }
    }
    