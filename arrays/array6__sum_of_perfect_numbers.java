package arrays;
import java.util.*;
class array6__sum_of_perfect_numbers
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,c,j,s=0;
        System.out.println("enter limit");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=1;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    c=c+j;
                }
            }
            if(c==a[i])
            {
                s=s+a[i];
            }
        }
        System.out.println("SUM OF PERFECT NO's="+s);
    }
}