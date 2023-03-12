public class PrintingDigits {
           public static void printingDigits(int n)
           {
                     if(n==0)
                     {
                          return;
                     }
                     printingDigits(n/10);

                     System.out.print(n%10+" ");

           }
           public static void main(String[] args) {
                   printingDigits(225000);    
           }
}
