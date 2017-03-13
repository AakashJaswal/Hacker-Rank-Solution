import java.util.Scanner;


public class libhelp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int day1=sc.nextInt();
		int mon1=sc.nextInt();
		int year1=sc.nextInt();
		int day2=sc.nextInt();
		int mon2=sc.nextInt();
		int year2=sc.nextInt();
	if(year1!=year2&&year1>year2)
		System.out.println(10000);
	else if(mon1!=mon2&&mon1>mon2)
	{  if(year1<year2)
		System.out.println(0);
	else
		System.out.println(500*(mon1-mon2));
	}
		else if(day1!=day2&&day1>day2)
	   {  if(mon1<mon2||year1<year2)
		   System.out.println(0);
	   else
			System.out.println(15*(day1-day2));
	   }
	   else 
		System.out.println(0);
	
	}
}
