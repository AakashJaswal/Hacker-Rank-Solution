import java.util.Scanner;

 class smallnotes {
		public static void main (String args[])
		{
		int n,no=0;
		double amnt;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{ amnt=sc.nextDouble();
		no=0;
		no+=(amnt/100); amnt%=100;
		no+=(amnt/50); amnt%=50;
		no+=(amnt/10); amnt%=10;
		no+=(amnt/5); amnt%=5;
		no+=(amnt/2); amnt%=2;
		no+=(amnt/1); amnt%=1;
		System.out.println(no);
		n--;
		
		}
	System.exit(0);

	}

}
