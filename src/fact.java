import java.math.BigInteger;
import java.util.Scanner;


public class fact {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	BigInteger fact= new BigInteger("1");
	while(num>1)
	{	fact= fact.multiply(BigInteger.valueOf(num));
	num--;
		}
	System.out.println(fact);
	
	}

}
