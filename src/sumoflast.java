import java.util.Scanner;

 class sumoflast {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int test,sum=0;
		char first,last;
	    test=sc.nextInt();
		while(test!=0)
		{String str=sc.next();
		last= str.charAt((str.length()-1)) ;
		first= str.charAt(0);
        System.out.println( Character.getNumericValue(last)+Character.getNumericValue(first) 	);   
      test--; 
		}
		System.exit(0);
 }
 }
		
 
			
		

	
