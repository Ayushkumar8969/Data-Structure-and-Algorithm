import java.util.Arrays;

public class LinearSearchIn2DArray {
                 
           public static int[] searchIn2DArray(int[][] arr, int target)
           {
                     int[] ans={-1,-1};
                      for(int row=0;row<arr.length;row++)
                      {
                             for(int col=0;col<arr[row].length;col++)
                             {
                                   if(target==arr[row][col])
                                   {
                                        // ans[0]=row;
                                        // ans[1]=col;
                                        // return ans;
                                        return new int[] {row,col};
                                   }
                             }
                      }
                      return new int[] {-1,-1};
           }
           public static void main(String[] args) {
                        int[][] arr={ {12,24,36},
                                                 {14,28,42},
                                      {4,56,45,28,21,36}
                                         };
                        int[] ans=searchIn2DArray(arr,42);
                         System.out.println(Arrays.toString(ans));


           }
}
