import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
class count2
{
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }  
      static char as(char x)
      {
          int ascii=(int)x;
          int v=(ascii-97)+1;
          int ac=(ascii-(26-v))%26;
           int ac2=(ac+97)-1;
           char tru=(char)ac2;
           return tru;
        }
          
          
 public static void main(String[] args)
    {
       FastReader s=new FastReader(); 
        int t=s.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
         System.out.println(t+"x"+i+"="+(t*i));
        }
    }
} 




