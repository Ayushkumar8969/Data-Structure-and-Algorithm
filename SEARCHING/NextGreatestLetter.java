class NextGreatestLetter 
{
                               static char nextGreatestLetter(char[] letters,char target) 
                               {
                                                        int start=0;
                                                         int end=letters.length-1;

                                                        // If such a character does not exist, return the first character in letters.


                                                          /* if(target>=letters[end]) 
                                                           {
                                                                         return letters[start];
                                                           }*/
                                                           
                                                           while(start<=end) 
                                                           {
                                                                          int mid= start + (end-start)/2;

                                                                          if(isAsc) 
                                                                          {
                                                                                         if(target<letters[mid]) 
                                                                                         {
                                                                                                         end=mid-1;
                                                                                         }
                                                                                         else 
                                                                                         {
                                                                                                     start=mid+1;
                                                                                         }
                                                                          }
                                                           }
                                                           return letters[start % letters.length];
                               }
                                  public static void main(String[] args) 
                                  {
                                                      char[] letters={'b','c','d','e','r'};
                                                      char target='t';
                                                      System.out.print(nextGreatestLetter(letters,target));
                                  }
}