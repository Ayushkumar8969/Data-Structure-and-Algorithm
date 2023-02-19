
public class BinarySearch {
              public static int binarySearch(int[] arr,int target)
              {
                            int start=0;
                            int end=arr.length-1;
                            while(start<=end)
                            {
                                    int mid=start +(end-start)/2;
                                      if(target==arr[mid])
                                      {
                                           // element found
                                            return mid;
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
                            return -1;
              }
              public static void main(String[] args) {
                        int[] arr={3,7,14,21,28,35,42,49,56,63};
                        System.out.println(binarySearch(arr, 56));
              }
}
