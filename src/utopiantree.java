import java.util.Scanner;


public class utopiantree {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int test,n;
test=sc.nextInt();
while(test!=0)
{  int h=1;
	n=sc.nextInt();
for(int i=0;i<=n;i++)	
     {if(i==0)
	continue;
	else if(i%2!=0)
		h*=2;
	else
		h++;
     }
	
	System.out.println(h);
	test--;
}

	}

}
