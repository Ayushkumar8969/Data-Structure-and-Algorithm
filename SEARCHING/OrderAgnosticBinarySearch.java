import java.util.Arrays;

public class OrderAgnosticBinarySearch {
               
                public static int orderAgnosticBinarySearch(int[] arr,int target)
                {
                         int start=0;
                         int end=arr.length-1;
                           
                         // checking the number is in ascending or descending order
                         // if it is ascending then it contains true, otherwise it contains false value
                         boolean isAscending=arr[start]<arr[end];

                         while(start<=end)
                         {
                              int mid=start +(end-start)/2;
                               
                               if(target==arr[mid])
                               {
                                   return mid;
                               }
                               if(isAscending)
                               {
                                      if(target>arr[mid])
                                      {
                                          // search in right
                                          start=mid+1;
                                      }
                                      else{
                                            // search in left
                                            end=mid-1;
                                      }
                               }
                               else{
                                        if(target>arr[mid])
                                        {
                                              end=mid-1;
                                        }
                                        else{
                                            start=mid+1;
                                        }
                               }
                         }
                         return -1;
                }
                public static void main(String[] args) {
                       int[] arr={12,24,36,48,60,72,84,96};// Ascending Order

                       int[] nums={50,40,30,20,10,9,5,4}; // Descending Order

                       System.out.println(Arrays.toString(arr));

                       System.out.println(orderAgnosticBinarySearch(arr,72));

                }
}
