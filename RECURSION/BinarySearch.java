public class BinarySearch {
        
            public static int binarySearch(int[] arr,int start,int end,int target)
            {
                            if(start>end)
                            {
                                return -1;
                            }

                            int mid=start +(end-start)/2;

                            if(target==arr[mid])
                            {
                                return mid;
                            }
                            else if(target>arr[mid])
                            {
                                return binarySearch(arr, mid+1, end, target);
                            }
                            else{
                                return binarySearch(arr, start, mid-1, target);
                            }
            }
            public static void main(String[] args) {
                     int[] arr={2,4,6,8,10,12,15};
                     int n=arr.length;
                     System.out.println(binarySearch(arr, 0,n-1, 36));

            }
}
