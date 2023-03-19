import java.util.Arrays;

public class FindMaximumMinimum {
               
        public static int[] findMaximumMinimum(int[] arr,int n,int i,int max,int min)
        {
                        if(i>=n)
                        {
                            return new int[] {min,max};
                        }
                        if(arr[i]>max)
                        {
                            max=arr[i];
                        }
                        if(arr[i]<min)
                        {
                            min=arr[i];
                        }
                        return findMaximumMinimum(arr, n, i+1, max, min);
        }
        public static void main(String[] args) {
                  
                            int[] arr={45,25,65,23,89,12,98,75,21};
                            int n=arr.length;

                    // for max you assume that your max value is so small
                            int max=Integer.MIN_VALUE;

                    // for min,you assume that your min value is so big
                            int min=Integer.MAX_VALUE;

                            int i=0;
                            int[] nums=findMaximumMinimum(arr, n, i, max, min);
                            System.out.println(Arrays.toString(nums));
        }

}
