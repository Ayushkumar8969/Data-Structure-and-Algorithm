public class Palindrome {
        public static boolean isPalindrome(int n) {
                if(n<0)
                {
                    return false;
                }
                int temp=n;
                int sum=0;
                while(n!=0)
                {
                       sum=sum*10+n%10;
                       n=n/10;
                }

                if(temp==sum)
                {
                    return true;
                }
                return false;
    
        }
        public static void main(String[] args) {

                  System.out.println(isPalindrome(-151));
        }
}
