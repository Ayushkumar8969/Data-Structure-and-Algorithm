import java.lang.Math;

public class DivisionUsingBinarySearch {
       
                    public static int divisionUsingBinarySearch(int dividend,int divisor)
                    {
                                 
                                   if(divisor==0)
                                   {
                                       // if divisor is ZERO then we won't get the correct answer
                                       return -1;
                                   }

                                 int start=0;
                                 int end=Math.abs(dividend);

                                 int ans=0;

                    // first I am making all numbers as positive numbers using absolute function 

                                 while(start<=end)
                                 {
                                       int mid=start+(end-start)/2;

                                       if(Math.abs((divisor*mid))==Math.abs(dividend))
                                       {
                                             if((divisor<0 && dividend>0) || (divisor>0 && dividend<0) )
                                             {
                                                  // if the divisor is -ve and dividend is +ve
                                                  // if the divisor is +ve and dividend is -ve
                                                  // then return the answer
                                                  return -mid;
                                             }
                                             else{
                                                  return mid;
                                             }
                                       }
                                       else if(Math.abs((divisor*mid))>Math.abs(dividend))
                                       {
                                              // search in left when the value is greater than dividend 
                                            end=mid-1;
                                       }
                                       else{
                                             // first store the answer beacuse it may be my possible answer
                                             // then search in left 
                                           ans=mid;
                                          start=mid+1;
                                       }
                                 }
                                   
                                 if((divisor<0 && dividend>0) || (divisor>0 && dividend<0) )
                                 {
                                   return -ans;
                                 }
                                    return ans;
                    }
                    public static void main(String[] args) {
                              System.out.println(divisionUsingBinarySearch(21,-7));
                    }

}
