import java.util.Scanner;


public class BinarNo {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem=0,count=0,max=-1;
while(n!=0)
		{ rem=n%2;
		   n=n/2;
		   if(rem==1)
		   {   count++;
		     if(count>max)
		    	 max=count;
		   }
		   else
			   count=0;
		}
System.out.println(max);
	}

}
