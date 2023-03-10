import java.util.Arrays;

public class CyclicSortDemo{
                   
                   public static void cyclicSort(int[] arr)
                   {
                                  int i=0;
                                  while(i<arr.length)
                                  {
                                         int correctIndex=arr[i]-1;

                                            if(arr[i]!=arr[correctIndex])
                                            {
                                                 swap(arr,i,correctIndex);
                                            }
                                            else{
                                                i++;
                                            }
                                  }

                   }
                   public static void swap(int[] arr,int first,int second)
                   {
                                int temp=arr[first];
                                arr[first]=arr[second];
                                arr[second]=temp;
                   }
                   public static void main(String[] args) {
                                 int[] arr={3,5,2,1,4};
                                 System.out.println(Arrays.toString(arr));
                                //  [3, 5, 2, 1, 4]
                                 cyclicSort(arr);
                                 System.out.println(Arrays.toString(arr));
                                //  [1, 2, 3, 4, 5]
                   }

} 