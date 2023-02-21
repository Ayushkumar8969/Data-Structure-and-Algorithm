public class PivotElement {
                 public static int pivotElement(int[] arr)
                 {
                              int start=0;
                              int end=arr.length-1;
                              while(start<=end)
                              {
                                           int mid=start +(end-start)/2;
                                           if(arr[mid]>arr[mid+1])
                                           {
                                                 return mid;
                                           }
                                           if(arr[mid-1]>arr[mid])
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
                    int[] arr = {3,4,5,6,1,2};
                      System.out.println(arr[pivotElement(arr)]);
                }
}
