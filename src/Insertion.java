import java.util.Scanner;


public class Insertion {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,j,n;
n=sc.nextInt();
int ar[]=new int[n];		
for(i=0;i<n;i++)
	ar[i]=sc.nextInt();
int el=ar[n-1];
for(j=n-2;j>=0;j--)
{ 	 if(ar[j]>el)
  ar[j+1]=ar[j];
else if(ar[j]<el)
ar[j+1]=el;
for(i=0;i<n;i++)
	System.out.print(ar[i]+" ");
	System.out.println();
}
	}	
	
	}
	

