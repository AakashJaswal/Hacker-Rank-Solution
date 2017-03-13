import java.util.Scanner;


class flow008 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    int test,n;
		test=sc.nextInt();
while(test!=0)
{
n=sc.nextInt();	
if(n>=10)
	System.out.println(-1);
else
 System.out.println("What an obedient servant you are!");
	 
test--;
}
System.exit(0);
	}

}
