package important;

import java.util.*;
class Mai
{
boolean checkPrime(int n)
{
    int i;
    boolean isPrime = true;

    for(i = 2; i <= n/2; ++i)
    {
        if(n % i == 0)
        {
            isPrime = false;
            break;
        }
    }

    return isPrime;
}
boolean checkeven(int n)
{
    int i;
    boolean iseven = false;

    if(n % 2 == 0)
        {
            iseven = true;
        }
        else
        {
            iseven=false;
        }
    
    return iseven;
}
public void main(String args[])
{
    Scanner ob=new Scanner(System.in);
    int i,t,j,k,knew,r,c=0;
       t=ob.nextInt();
    
      while(t>0)
      {
     int n=ob.nextInt();
      int a[]=new int[n];
       for(i=0;i<n;i++)
      {
        a[i]=ob.nextInt();
      }
      c=0;
        for(i=0;i<n-1;i++)
      {
        
        for(j=i+1;j<n;j++)
        {
            
              r=a[i]^a[j];
              knew=r; 
        
            for(k = 2; k <= knew/2; ++k)
    {
        if(checkPrime(k))
        {
            if (checkPrime(knew-k))
            {
                if((checkeven(k)==true&&checkeven(knew-k)==true)||(checkeven(k)==false&&checkeven(knew-k)==false))
                {
                
                ++c;
                
                break;
            }
            }   
             }
             }  
                
            
        }
    }
   System.out.println(c);
    t--;
}
   
}
}
