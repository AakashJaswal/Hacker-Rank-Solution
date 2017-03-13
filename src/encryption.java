import java.util.Scanner;


public class encryption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String st=sc.nextLine();
		 float size=st.length();
		 int count=0;
		 float root=(float)Math.sqrt(size);
		
		 char arr[]=st.toCharArray();
		 int row= (int)Math.floor(root);
		 int col=(int)Math.ceil(root);
		 if(row*col<size)
			 row++;
		 char ar[][]=new char[row][col];
		 for(int i=0;i<row;i++)
		  for(int j=0;j<col;j++)   
		 { if(count<size)
			 {ar[i][j]=arr[count];
		     count++;}
		 
		 }
		 
		 for(int i=0;i<col;i++)
		 { for(int j=0;j<row;j++)   
		 { if(ar[j][i]==0)
		  System.out.print("");else
			  System.out.print(ar[j][i]);
		 }
		 System.out.print(" ");
		 }
		 }

}
