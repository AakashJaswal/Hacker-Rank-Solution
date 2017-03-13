import java.util.Scanner;


public class Sherlock2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
int test=sc.nextInt();
while(test!=0)
{int flag=0;
	double low=sc.nextInt();
double high=sc.nextInt();
low=Math.sqrt(low);
high=Math.sqrt(high);
 high=Math.floor(high);
low= Math.ceil(low);

for(int i=(int)low;i<=high;i++)
{flag++;}
System.out.println(flag);
test--;
}

	}

}
