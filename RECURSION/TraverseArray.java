public class TraverseArray {
               
                public static void traverse(int[] arr,int n,int i)
                {
                                  if(i>=n)
                                  {
                                      return;
                                  }
                                  System.out.print(arr[i]+" ");

                                  traverse(arr, n, i+1);

                }
                public static void main(String[] args) {
                                 int[] arr={12,24,36,48,60,72,84};
                                 int n=arr.length;
                                 traverse(arr, n, 0);
                }
}
