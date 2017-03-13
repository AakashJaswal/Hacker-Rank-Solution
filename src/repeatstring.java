import java.util.Scanner;


public class repeatstring {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int a=str.length();
long n=sc.nextLong();
long count=0,mod=0,div=0;
for(int i=0;i<str.length();i++)
if(str.charAt(i)=='a')
	count++;
if(n>=a){
div=(n/a);
mod=n%a;
count=count*div;

if(mod!=0)
	for(int i=0;i<mod;i++)
		if(str.charAt(i)=='a')
			count++;
System.out.println(count);
}
else 
{count=0;
	for(int i=0;i<a;i++)
	if(str.charAt(i)=='a')
		count++;
System.out.println(count);
}





	}

}
