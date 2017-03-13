import java.util.Scanner;


public class apanddel {



    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int i;
        int check=0;
        for(i=0;i<s.length()&&i<t.length();i++)
          {
          if(s.charAt(i)!=t.charAt(i))
            break;
          }
      
      
      int d=s.length()-i;
      int a=t.length()-i;
      
      check=k-d-a;
      if(check==0)
        {
        System.out.println("Yes");
      }
      else if(check<0)
        {
        System.out.println("No");
      }
      else
        {
        if(check%2==0)
          {
          System.out.println("Yes");
        }
        else
          {
          if(check>=(2*i))
            {System.out.println("Yes");}
          else
            {System.out.println("No");}
            
        }
      }
    }
}
