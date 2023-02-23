public class SearchInSortedAndRotated {

    public static int search(int[] arr, int target) {
           int pivot=findPivot(arr);
            int ans=0;
            int end=arr.length-1;
            if(target<arr[0])
            {
                ans=binarySearch(arr,target,pivot+1,end);
            }
            else{
                ans=binarySearch(arr,target,0,pivot);
            }
            return ans;
    }
    public static int binarySearch(int[] arr, int target,int start,int end){
        
           while(start<=end)
           {
                int mid=start +(end-start)/2;
               if(target==arr[mid])
               {
                   return mid;
               }
               else if(target >arr[mid])
               {
                   start=mid+1;
               }
               else{
                   end=mid-1;
               }
           }
           return -1;
    }
     public static int findPivot(int[] arr)
    {
              int n=arr.length;
              int start=0;
              int end=arr.length-1;
              while(start<=end)
              {
                   int mid= start +(end-start)/2;
                     if(start==end)
                     {
                         return start;
                     }
                   if(mid<n-1 && arr[mid]>arr[mid+1])
                   {
                        return mid;
                   }
                   if(mid>0 && arr[mid-1]>arr[mid])
                   {
                       return mid-1;
                   }
                   if(arr[start]>arr[mid])
                   {
                         end=mid-1;
                   }
                   else {
                       start=mid+1;
                   }
              }
              return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12,14,16,2,4,6,8,10,11};
          System.out.println(search(arr,10));
    }
}
