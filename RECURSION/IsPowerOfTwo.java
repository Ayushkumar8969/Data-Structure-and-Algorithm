public class IsPowerOfTwo {
             
        public static boolean isPowerOfTwo(int n)
        {
                            if(n<=0)
                            {
                                return false;
                            }
                         int ans=findPowerOfTwo(n);

                            if(ans==n)
                            {
                                return true;
                            }
                            else{
                              return false;
                            }
                            
        }
        public static int findPowerOfTwo(int n)
        {
                          if(n==1)
                          {
                              return 1;
                          }
                             return 2*findPowerOfTwo(n/2);
                         
        }
        public static void main(String[] args) {
                     System.out.println(isPowerOfTwo(16));
        }
}
