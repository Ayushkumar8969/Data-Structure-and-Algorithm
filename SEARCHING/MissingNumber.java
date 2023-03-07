public class MissingNumber {
         public static int missingNumber(int[] arr)
         {
                     int start=0;
                     int end=arr.length-1;
                     while(start<end)
                     {
                            int mid=start +(end-start)/2;
                            if(mid+1==arr[mid])
                            {
                                // right search
                                start=mid+1;
                            }
                            else if(mid+1!=arr[mid])
                            {
                                 //left search
                                 end=mid;
                            }
                     }
                     return start+1;
         }
         public static void main(String[] args) {
                 int[] arr={1,2,3,4,5,6,8,9};
                 System.out.println(missingNumber(arr));
         }
}
