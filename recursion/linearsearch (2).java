package recursion;

import java.util.*;
public class linearsearch
{
    public void lsearch(int a[],int n,int ele,int i)
    {
       if(i<n)
       {
           if(a[i]==ele)
           {
               System.out.println("element found and index="+i);
               return;
            }
            lsearch(a,n,ele,++i);
        }
        else
        {
            System.out.println("element not found");
    }
}
        public void main()
    {   Scanner ob=new Scanner(System.in);
        int i;
        System.out.println("enter limit");
     int num=ob.nextInt();
     int a[]=new int[num];
     
     System.out.println("enter elements");
     
     for(i=0;i<num;i++)
     {
         a[i]=ob.nextInt();
        }
    System.out.println("enter elements to be searched");
        int ele=ob.nextInt();
     lsearch(a,num,ele,0); 
    }
}
     
     
    
    
    
         
        