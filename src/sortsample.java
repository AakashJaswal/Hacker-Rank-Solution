import java.util.Scanner;


public class sortsample {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int v=sc.nextInt();
int s=sc.nextInt();
int ar[]=new int[s];
int fnd=-1;
for(int i=0;i<s;i++)
{	ar[i]=sc.nextInt();
if(ar[i]==v)
	fnd=i;
}
	System.out.println(fnd);
	}

}
