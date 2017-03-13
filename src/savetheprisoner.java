import java.util.Scanner;


public class savetheprisoner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		int n,m,s;
		while (test!=0){
	    n=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();
		int dead=(m+s-1)%n;
	if(dead!=0)	
		System.out.println(dead);
	else 
		System.out.println(n);
	test--;
		}
		}

}
