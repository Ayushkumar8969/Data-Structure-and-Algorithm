public class PrintNaturalNumbers {
            
            public static void printNaturalNumbers(int n)
            {
                       if(n==0)
                       {
                             return;
                       }
                       printNaturalNumbers(n-1);

                       System.out.print(n+" ");

            }
            public static void main(String[] args) {
                    printNaturalNumbers(5);
            }
}
