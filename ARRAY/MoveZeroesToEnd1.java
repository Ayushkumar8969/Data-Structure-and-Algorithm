import java.util.Arrays;

public class MoveZeroesToEnd1 {
    public static int[] moveZeroes(int[] arr) {
         
        int n=arr.length;
        int i=0,j=1;
        while(i<n-1 && j<n)
        {
                 if(arr[i]==0)
                 {
                       if(arr[j]==0){
                           j++;
                       }
                       else{
                           arr[i]=arr[j];
                           arr[j]=0;
                           i++;
                           j++;
                       }
                 }
                 else{
                       i++;
                       j++;
                 }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr={1,2,0,1,0,4,0};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(moveZeroes(arr)));
}
}
