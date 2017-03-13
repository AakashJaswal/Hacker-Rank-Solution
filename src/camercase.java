import java.util.Scanner;


public class camercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int count=1;
		for(int i=1;i<st.length();i++)
		{int n = st.charAt(i);
		 if(n>=65&&n<=90)
			 count++;
		}
		System.out.println(count);

	}

}
