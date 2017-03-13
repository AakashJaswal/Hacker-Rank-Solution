import java.util.Scanner; 
import java.lang.Math.*;


 class square {

 public static void main(String[] args) {
		int n,flag,i;
		double ar;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		flag=n;
		while(n!=0)
		{ 
			ar=sc.nextInt();
	    	  ar=Math.sqrt(ar);
	    	  System.out.println((int)ar);
	  
		 n--;
		}
System.exit(0);
	}

}
