public class SearchInNearlySortedArray {
                  
                public static int searchInNearlySortedArray(int[] arr,int target)
                {
                                int n=arr.length;
                               int start=0;
                               int end=arr.length-1;
                               while(start<=end)
                               {
                                    int mid=start +(end-start)/2;
                                      
                                      if(target==arr[mid])
                                      {
                                           return mid;
                                      }
                                      if(mid>0 && target==arr[mid-1])
                                      {
                                           return mid-1;
                                      }
                                      if(mid<n-1 && target==arr[mid+1])
                                      {
                                           return mid+1;
                                      }
                                      if(target>arr[mid])
                                      {
                                           start=mid+2;
                                      }
                                      else{
                                            end=mid-2;
                                      }
                               }
                               return -1;
                }
                public static void main(String[] args) {
                          int[] arr=  {10, 3, 40, 20, 50, 80, 70};
                          System.out.println(searchInNearlySortedArray(arr, 40));

                }
}
