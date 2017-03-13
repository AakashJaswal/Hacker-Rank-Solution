import java.util.Scanner;


public class sherandarra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		while(test!=0){	int n =sc.nextInt();
		int flag=0,sum=0,left=0;
		int ar1[]=new int[n];
	
		for(int i=0;i<n;i++)
		{	ar1[i]=sc.nextInt();sum+=ar1[i];}
		for(int i=1;i<n-1;i++)
		{		left+=ar1[i-1];
		if(left==sum-left-ar1[i])
		{	flag++;
		break;}
		}
					
	if(flag!=0)
		System.out.println("YES");
	else 
		System.out.println("NO");
	test--;
		}
	}

}
