import java.util.Scanner;


public class taumbday {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int test=sc.nextInt();
 while(test!=0){
	 long b=sc.nextLong();
	 long w=sc.nextLong();
 long x=sc.nextLong();
 long y=sc.nextLong();
 long z=sc.nextLong();
 if(x>y&&y+z<x)
	 x=y+z;
 else if(y>x&&x+z<y)
	y=x+z;
 System.out.println(b*x+w*y);
 test--;
 }
	}

}
