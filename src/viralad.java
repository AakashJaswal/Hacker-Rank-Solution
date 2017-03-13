import java.util.Scanner;


public class viralad {
	public static void main (String args[])
	{Scanner sc=new Scanner(System.in);
	int flag=0,count=Math.floorDiv(5, 2),sum=0;    
	int no=sc.nextInt();
	    for(int i=1;i<=no;i++)
	    {  
	    	sum+=count;
	    	flag+=sum;
	    	count=Math.floorDiv(sum, 2); 
	    }
	    System.out.println(flag);
	  
	 
		
		
	}

}
