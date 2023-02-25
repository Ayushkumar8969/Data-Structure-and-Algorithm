import java.util.Arrays;
class ReverseString {
    public static void reverseString(char[] s) {
           int start=0;
           int end=s.length-1;
           while(start<=end)
           {
                  char temp=s[start];
                  s[start]=s[end];
                  s[end]=temp;
                  start++;
                  end--;
           }
    }
         public static void main(String[] args) {
                 char[] str={'a','y','u','s','h'};
                 reverseString(str);
                 System.out.println(Arrays.toString(str));

         }
}