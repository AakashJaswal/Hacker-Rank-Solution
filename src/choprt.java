import java.util.Scanner;

 class choprt {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int fir,sec;
while(n!=0)
{  fir=sc.nextInt();
sec=sc.nextInt();
if(fir<sec)
   System.out.println("<");
else if(fir>sec)
	System.out.println(">");
else
	System.out.println("=");
n--;

}
System.exit(0);
	}

}
