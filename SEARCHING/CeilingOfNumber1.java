class CeilingOfNumber1
{
                             public static void main(String[] args)
                             {
                                           int[] a={10,20,30,40,50,60};
                                            int target=65;
                                            System.out.print(ceilingOfNumber(a,target));
                             }
                               static int ceilingOfNumber(int[] a,int target)
                               {
                                         int start=0;
                                         int end=a.length-1;
                                                if(target>a[end])
                                                {
                                                        return -1;
                                                }
                                              
                                            boolean isAsc=a[start]<a[end];

                                            while(start<=end)
                                         {
                                                 int mid= start + (end-start)/2;
                                                       if(target==a[mid])
                                                       {
                                                                  return mid;
                                                       }
                                                 if(isAsc)
                                                 {
                                                             if(target<a[mid])
                                                              {
                                                                    end=mid-1;
                                                              }
                                                             else 
                                                             {
                                                                    start=mid+1;
                                                              }
                                                 }
                                                 else 
                                                 {
                                                                  if(target>a[mid])
                                                                  {
                                                                           end=mid-1;
                                                                   }
                                                                   else 
                                                                   {
                                                                              start=mid+1;
                                                                   }
                                                 }
                                         }
                                         return start;
                                            
                               }
                                 
}
                                 
                                 


 