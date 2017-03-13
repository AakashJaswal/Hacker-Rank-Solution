import java.util.Scanner;


class FLOW018 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,test;
test=sc.nextInt();
while(test!=0)
{ int fact=1;
n=sc.nextInt();
while(n!=-1)
   {
   if(n==0)
   {
	   System.out.println(fact);
   n--;
   }
	   else if(n==1)
		{System.out.println(fact);
		n=n-2;
		}
		else
	   { fact=fact*n;
		n--; 
	   }
   }
test--;
}
System.exit(0);
	}

}
