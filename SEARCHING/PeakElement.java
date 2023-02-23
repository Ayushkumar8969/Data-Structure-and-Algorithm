public class PeakElement {

    public static int peakElement(int[] arr) {
        int n=arr.length;
           int start=0;
           int end=n-1;
           while(start<=end)
           {
                   int mid=start +(end-start)/2;
                   if(n==1)
                   { 
                      // when size of the array is 1
                       return 0;
                   }
                   if(mid==0)
                   {
                         if(arr[mid]>arr[mid+1])
                         {
                             return 0;
                         }
                         else{
                             return 1;
                         }
                   }
                   if(mid==n-1)
                   {
                          if(arr[mid]>arr[mid-1])
                          {
                              return n-1;
                          }
                          else{
                              return n-2;
                          }
                   }
                   if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
                   {
                       return mid;
                   }
                   else if(arr[mid-1]>arr[mid])
                   {
                        end=mid-1;
                   }
                   else if(arr[mid+1]>arr[mid])
                   {
                         start=mid+1;
                   }
           }
           return -1;   
    }
      public static void main(String[] args) {
           int[] arr={5,10,20,15};
           System.out.println(peakElement(arr));
      }
}
