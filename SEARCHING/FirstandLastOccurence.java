import java.util.Arrays;

class FirstandLastOccurence {
    public static int[] searchRange(int[] arr, int target) {
        int[] ans={-1,-1};
        ans[0]=binarySearch(arr,target,true);
        ans[1]=binarySearch(arr,target,false);
        return ans;
    }
    public static int binarySearch(int[] arr,int target,Boolean found)
    {
         int start=0;
         int end=arr.length-1;
         int ans=-1;
         while(start<=end)
         {
              int mid=start +(end-start)/2;
               if(target==arr[mid])
               {
                    ans=mid;
                    if(found)
                    {
                        end=mid-1; // first Occurence 
                    }
                    else{
                        start=mid+1; // last Occurence
                    }
               }
               else if(target>arr[mid])
               {
                   start=mid+1;
               }
               else if(target<arr[mid]){
                   end=mid-1;
               }
         }
         return ans;
    }
       public static void main(String[] args) {
                  int[] arr={2,4,8,8,8,8,8,8,10,12,14};
                  int target=8;
                  System.out.println(Arrays.toString(searchRange(arr, target)));

       }
}