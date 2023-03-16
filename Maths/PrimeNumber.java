public class PrimeNumber{
               public static void printPrime(int N)
               {
                        for(int i=2;i<=N;i++)
                        {
                               if(isPrime(i)) 
                               {
                                   System.out.print(i+" ");
                               }
                        }
               } 
               public static boolean isPrime(int N)
               {
                       for(int i=2;i*i<=N;i++)
                       {
                                  if(N%i==0)
                                  {
                                      return false;
                                  }
                       }
                       return true;
               }
               public static void main(String[] args) {
                          printPrime(50);
               }
}