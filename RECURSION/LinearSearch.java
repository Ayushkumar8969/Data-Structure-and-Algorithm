public class LinearSearch {
                    
                 public static int linearSearch(int[] arr,int n,int i,int target)
                 {
                            // Base Case
                                   if(i>=n)
                                   {
                                       return -1;
                                   }
                            // Ek Solve Kardo 
                                   if(target==arr[i])
                                   {
                                           return i;
                                   }
                            // Baaki Recursion Sambhal Lega
                                   return linearSearch(arr, n, i+1, target);
                 }
                 public static void main(String[] args) {
                              int[] arr={50,20,40,63,12,87,14};
                              int n=arr.length;
                              int i=0;
                              System.out.println(linearSearch(arr, n, i, 120));
                 }
}
