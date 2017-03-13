import java.util.Scanner;


public class kaprekarno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long low=sc.nextLong();
		long high=sc.nextLong();
		int count=0;
		for(Long i=low;i<=high;i++)
		{	long a=i*i;
		 String text=""+a;
		 int size=text.length();
		 if(size%2!=0)
			 {text='0'+text;
		 size++;}
		 int mid=size/2;
		String part1=text.substring(0,mid);
	    String part2=text.substring(mid,size);
	    int num1=Integer.valueOf(part1);
	    int num2=Integer.valueOf(part2);
	    if(num1+num2==i)
	    {System.out.print(i+" ");count++;
	    }
	    }
		if(count==0)
			System.out.println("INVALID RANGE");
		 
	}

}
