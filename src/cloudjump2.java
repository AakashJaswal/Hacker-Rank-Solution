import java.util.Scanner;


public class cloudjump2 

	{

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
int n = in.nextInt();
	        int c[] = new int[n];
	        for(int i=0; i < n; i++)
	            c[i] = in.nextInt();
	        int count=0,i=0;
	        while(i<n-1)
	        { if(i+2<n)
	        	if(c[i+2]==1)
	        	i++;
	        else 
	        	i+=2;       
	        else 
	        	i++;
	        count++;
	         }
	        System.out.println(count);
	        
	    }
	}