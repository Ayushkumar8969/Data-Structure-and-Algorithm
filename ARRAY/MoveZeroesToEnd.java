import java.util.Arrays;

public class MoveZeroesToEnd{
                 
            public static int[] moveZeroes(int[] arr){
                        int n=arr.length;

                        int[] temp=new int[n];
                        int k=0,j=n-1;
                       for(int i=0;i<n;i++)
                       {
                                if(arr[i]!=0){
                                    temp[k]=arr[i];
                                    k++;
                                }
                                else{
                                    temp[j]=arr[i];
                                    j--;
                                }
                       }
                       return temp;
            }
            // [1, 2, 0, 1, 0, 4, 0]
            // [1, 2, 1, 4, 0, 0, 0]
            public static void main(String[] args) {
                    int[] arr={1,2,0,1,0,4,0};
                    System.out.println(Arrays.toString(arr));
                    System.out.println(Arrays.toString(moveZeroes(arr)));
            }
}