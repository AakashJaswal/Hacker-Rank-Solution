
import java.util.Scanner;


public class rookierank1 {
	

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
char h[]={'h','a','c','k','e','r','r','a','n','k'};

while(s>0){
 String str =sc.next();
 int done=-1;
 char ar[]=new char[str.length()];
 ar=str.toCharArray();
for(int i=0;i<h.length-1;i++)
	{ done++;if(done>0)break;
	for(int j=0;j<ar.length;j++)
	{
		if(h[i]==ar[j])
			 {i++;
			if(i>=h.length)
			break;
			}
	}
		
	}
	
	
	if(done!=0)
		System.out.println("NO");
	else 
		System.out.println("YES");
	
	
s--;}
	
	
	}
}