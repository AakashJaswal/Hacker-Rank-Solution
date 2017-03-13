import java.util.Scanner;


public class servicelane {
public static int minf(int low,int high,int ar[])
{ int min=Integer.MAX_VALUE;
	for(int i=low;i<=high;i++)
	if(ar[i]<min)
		min=ar[i];
	return min;

}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int test=sc.nextInt();
int ar[]=new int[s];
for(int i=0;i<s;i++)
	ar[i]=sc.nextInt();
	while(test!=0)
	{int low=sc.nextInt();
	int high=sc.nextInt();
		int min=minf(low,high,ar);
		System.out.println(min);
		test--;
	}
	
	}

}
