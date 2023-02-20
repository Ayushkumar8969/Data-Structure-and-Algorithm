public class PeakIndexInMountainArray{
        public static int peakIndexInMountainArray(int[] arr) {
              int n=arr.length;
              int start=0;
              int end=n-1;
              while(start<=end)
              {
                   int mid=start +(end-start)/2;
                    if(mid==0 && arr[mid+1]>arr[mid])
                    {
                          // edge cases when mid=0
                         return mid+1;
                    }
                    if(mid==n-1 && arr[mid-1]>arr[mid])
                    {
                          // edge cases when mid=n-1
                        return mid-1;
                    }
                    if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
                    {
                        // peak element
                         return mid;
                    }
                    else if(arr[mid-1]<arr[mid])
                    {
                        // search in right
                        start=mid+1;
                    }
                    else if(arr[mid]>arr[mid+1])
                    {
                         // search in left
                         end=mid-1;
                    }
              }
              return -1;
        }
        public static void main(String[] args) {
           int[] arr = {0,10,5,2};
             System.out.println(arr[peakIndexInMountainArray(arr)]);
        }
}
