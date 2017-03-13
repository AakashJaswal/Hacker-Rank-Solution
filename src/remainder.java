import java.util.Scanner;

class remainder {
public static void main (String args[])
{
int n,a,b,rem;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{ a=sc.nextInt();
b=sc.nextInt();
rem=a%b;
System.out.println(rem);
n--;
}
System.exit(0);
}

}
