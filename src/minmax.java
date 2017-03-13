import java.util.Scanner;


public class minmax {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		long max,min,sum=0,el;
		max = min = sum = sc.nextLong();
for(int i=1;i<5;i++)
			{ el=sc.nextLong();
			 sum+=el;
			 if(el>max)
				 max=el;
			 if(el<min)
				 min=el;
			 }
System.out.println((sum-max)+" "+(sum-min));
sc.close();
System.exit(0);
	}

}
