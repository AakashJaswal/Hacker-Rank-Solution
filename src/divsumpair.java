import java.util.Scanner;
public class divsumpair {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,j,n,k,sum=0;
	n=sc.nextInt();
	k=sc.nextInt();
	int ar[]=new int[n];
	for(i=0;i<n;i++)
		ar[i]=sc.nextInt();
	for(i=0;i<n;i++)
		for(j=0;j<i;j++)
			if((ar[i]+ar[j])%k==0)
				sum++;
	System.out.println(sum);
	}

}
