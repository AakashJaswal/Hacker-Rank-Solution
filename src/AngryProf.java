import java.util.Scanner;


public class AngryProf {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int el,t,n,lim;
t=sc.nextInt();
while(t!=0)
     { n=sc.nextInt();
     lim=sc.nextInt();
	int sum=0;
	for(int i=0;i<n;i++)
	     {el=sc.nextInt();
      if(el<=0)
    	  sum++;
	       }if(sum>=lim)
		      System.out.println("NO");
	       else	
	       	  System.out.println("YES");
     t--;
     
     }
	}

}
