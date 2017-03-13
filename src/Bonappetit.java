import java.util.Scanner;


public class Bonappetit {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		int n,k,c,sum=0;
n=sc.nextInt();
k=sc.nextInt();
int cost[]=new int[n];
for(int i=0;i<n;i++)
sum+=(cost[i]=sc.nextInt());
c=sc.nextInt();
sum=sum-cost[k];
sum=sum/2;
if(c==sum)
	System.out.println("Bon Appetit");
else 
	System.out.println(c-sum);
	}

}
