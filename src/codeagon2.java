import java.util.Scanner;


public class codeagon2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=0,count=0;
		int n=sc.nextInt();
		int c=sc.nextInt();
		int max,dec=0;
		int ar1[]=new int[c];
		int ar2[]=new int[c];
		for(int i=0;i<c;i++)
		{		ar1[i]=sc.nextInt();
		ar2[i]=sc.nextInt();
		}
	while(count<n)
	{	max=0;
			for(int i=0;i<c;i++)
				 {if(ar2[i]>max&&ar1[i]!=0)
					{max=ar2[i];
                  dec=i;}}
				count++;
      			total+=max;
				ar1[dec]--;
	}	
	System.out.println(total);
	}

}
