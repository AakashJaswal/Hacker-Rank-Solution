import java.util.Scanner;

 class FLOW001 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int test,fir,sec;
test=sc.nextInt();
while(test!=0)
{ fir=sc.nextInt();
sec=sc.nextInt();
System.out.println(fir+sec);
test--;
}
System.exit(0);
}
}