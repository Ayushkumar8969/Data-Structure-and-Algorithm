public class FindMinimum {
    
    public static int findMinimum(int[] arr,int n,int i,int min)
    {
               if(i>=n)
               {
                    return min;
               }
               if(arr[i]<min)
               {
                  min =arr[i];
               }
               return findMinimum(arr, n, i+1, min);
    }
    public static void main(String[] args) {
             int[] arr={30,20,10,40,80,60};
             int min=Integer.MAX_VALUE;
             int i=0;
             int n=arr.length;
             System.out.println(findMinimum(arr, n, i, min));
    }
}
