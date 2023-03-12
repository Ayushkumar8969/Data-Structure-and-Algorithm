public class CheckIfArrayIsSortedOrNot {

         public static boolean checkSorted(int[] arr,int n,int i)
         {
                     if(i==n)
                     {
                        return true;
                     }
                     if(arr[i-1]>arr[i])
                     {
                         return false;
                     }
                     return checkSorted(arr,n,i+1);
         }
         public static void main(String[] args) {
                int[] arr={4,3,1,2,4,4};
                int n=arr.length;
                System.out.println(checkSorted(arr, n, 1));
         }
}
