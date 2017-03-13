import java.util.Scanner;


public class cavitymap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ar[][]=new char[n][n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s= sc.next();
            ar[i]=s.toCharArray();
        }
        for(int i=1;i<n-1;i++)
        	for(int j=1;j<n-1;j++)
        	{ if(ar[i][j]>ar[i+1][j]&&ar[i][j]>ar[i-1][j])
        	    {  if(ar[i][j]>ar[i][j+1]&&ar[i][j]>ar[i][j-1])
        	    	ar[i][j]='X';
        	    }
        	}
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{System.out.print(ar[i][j]);}     
        	System.out.println("");
        }
        
        }
        

}
