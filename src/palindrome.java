import java.util.Scanner;

 class palindrome {

	public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  int test,num,rev=0,dig=0,n;
test=sc.nextInt();
  while(test!=0)
           {n=0;
           rev=0;
	  num =sc.nextInt();
           n=num;
	        while(n!=0)
                      { dig=n%10;
        	             n/=10;
        	             rev*=10;
        	             rev+=dig;
        	             
                       }
	        if(rev==num)
	        {
	        	System.out.println("wins");
	        	
	        }
	        else 
	        	System.out.println("losses");
	  test--;
           }
  
System.exit(0);
	}

}
 	