import java.util.Scanner;


public class media {

	public static void main(String[] args) 
	{ Scanner sc= new Scanner(System.in);
	  int dest;
	  int trav=100;
	 int a=100;
	  int c;
	  dest = sc.nextInt();
	  int flag=0;
	  while((flag+=100)<dest)
	  {  
	  System.out.print(trav+" ");       
	       flag+=trav;
	        c=trav+a;
		    a=trav;
		    trav=c;
		    flag=flag+trav;
	      
	  
	  }
	  
              	  
	}	  
	
	
 	}
