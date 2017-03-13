import java.util.Scanner;

public class beautida
{
	public static int reverse(int num){
		int rev=0,dig=0,n;
		n=num;
		while(n!=0)
		    { dig=n%10;
		      n=n/10;
		      rev*=10;
		      rev+=dig;
			}
		return rev;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tot=0,high,low,num1,num2,mod,ret;
		low=sc.nextInt();
		high=sc.nextInt();
		mod=sc.nextInt();
		for(int i=low;i<=high;i++)
		{   
		ret=reverse(i);	
		if(Math.abs(i-ret)%mod==0)	
				tot++;
		}
		System.out.println(tot);

	}
}
