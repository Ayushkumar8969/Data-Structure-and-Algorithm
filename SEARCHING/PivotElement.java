public class PivotElement {
                 public static int pivotElement(int[] arr)
                 {
                              int n=arr.length;
                              int start=0;
                              int end=n-1;
                              while(start<=end)
                              {
                                           int mid=start +(end-start)/2;
                                            if(start==end)
                                            {
                                                return start;
                                                //{2,4,6,8,10} In this we are returning 10 
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
                                                // search in left
                                                 end=mid-1;
                                           }
                                           else if(arr[start]<arr[mid])
                                           {
                                                // search in right
                                                 start=mid+1;
                                           }
                              }
                              return -1;
                 } 
                 public static void main(String[] args) {
                    int[] arr = {3,1,2};
                      System.out.println(arr[pivotElement(arr)]);
                }
}
