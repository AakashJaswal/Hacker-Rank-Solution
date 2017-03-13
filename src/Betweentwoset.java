import java.util.Scanner;


public class Betweentwoset {
	public static long gcd2(long a,long b)

	{ if(a==0)
		return b;
	else if(b==0)
		return a;
	else if(a>b)
		{ return gcd2(b,a%b);}
	else {return gcd2(a,b%a);}
	}
	public static long lcm2(long c,long d)


	{ return c*d/gcd2(c,d);	}	
public static long gcdar(long arr2[]){
		long first=arr2[0];
		if(arr2.length==1)
		return first;
    else {for(int i=1;i<arr2.length;i++)
	   first=gcd2(first,arr2[i]);
	   return first;}
	}
	public static long lcmar(long arr1[]){
		long first=arr1[0],wh;
		if(arr1.length==1)
		return first;
    else {for(int i=1;i<arr1.length;i++)
	   first=lcm2(first,arr1[i]);
	   return first;}
	}
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
long arr1[]=new long[b];
int a=sc.nextInt();
long arr2[]=new long[a];
for(int i=0;i<b;i++)
	arr1[i]=sc.nextInt();
long x=lcmar(arr1); 
for(int i=0;i<a;i++)
	arr2[i]=sc.nextInt();
long y=gcdar(arr2);
if(y/x==0||y%x!=0)
	System.out.println(0);
else {int count=0;
	for(int i=1;i<=y/x;i++)
		if(y%(x*i)==0)
			count++;	
System.out.println(count);
}
	}
	
}
