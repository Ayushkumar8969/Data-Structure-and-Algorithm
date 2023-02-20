public class PeakIndexInMountainArray1{
    public static int peakIndexInMountainArray(int[] arr) {
          int start=0;
          int end=arr.length-1;
          while(start<=end)
          {
               int mid=start +(end-start)/2;
    
                if(arr[mid]<arr[mid+1])
                {
                    // search in right
                      start=mid+1;
                }
                else
                {
                        //Here there are two conditions 
                        // (1)here may occur a peak element 
                        //(2) standing in LINE B and search in left along with peak element
                         end=mid;
                }
                
          }
          // you can return both start or end
          return start;
    }
    public static void main(String[] args) {
       int[] arr = {0,10,5,2};
         System.out.println(arr[peakIndexInMountainArray(arr)]);
    }
}
