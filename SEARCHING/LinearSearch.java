class LinearSearch 
{
                  public static int linearSearch(int[] arr,int target)
                  {
                            for(int index=0;index<arr.length;index++)
                            {
                                    if(target==arr[index])
                                    {
                                         return index;
                                    }  
                            }
                            return -1;
                  }
                  public static void main(String[] args) {
                         int[] arr={4,8,12,16,20,24,28,32};
                         System.out.println("Found at "+linearSearch(arr,24)+" index");
                  }
}