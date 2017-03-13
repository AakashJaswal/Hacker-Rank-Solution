import java.util.Scanner;


public class finddigit {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int test=sc.nextInt();
while(test!=0)
{
	int num=sc.nextInt();
	int n=num,dig,count=0;
	while(n!=0)
	{ dig=n%10;
	  if(dig==0)
		  { n=n/10;continue;}
	  else
	  { if(num%dig==0)
			  count++;
	  }n=n/10;
	  }
	System.out.println(count);
test--;
}

	}

}
