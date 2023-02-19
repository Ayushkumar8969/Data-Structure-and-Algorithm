public class FirstOccurence{
    public static int binarySearch(int[] arr,int target)
    {
                  int start=0;
                  int end=arr.length-1;
                  int ans=-1;
                  while(start<=end)
                  {
                          int mid=start +(end-start)/2;
                            if(target==arr[mid])
                            {
                                 //first store the answer then search in left
                                 ans=mid;
                                 end=mid-1;    
                            }
                            else if(target>arr[mid])
                            {
                                // search in right
                                 start=mid+1;
                            }
                            else{
                                  // search in left
                                  end=mid-1;
                            }
                  }
                  // element not found
                  return ans;
    }
    public static void main(String[] args) {
              int[] arr={3,7,14,21,21,21,21,21,21,21,21,56,63};
              System.out.println(binarySearch(arr, 21));
    }
}