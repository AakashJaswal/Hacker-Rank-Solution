import java.util.*;
public class llet {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	int test=sc.nextInt();
	while(test>0)
	{int half;
	int count=0;
		String str=sc.next();
	char ar[]=new char[str.length()];
	ar=str.toCharArray();
	if(str.length()%2==0)
		 half=(str.length()/2)-1;
	else  
		half=(str.length()/2);
	for(int i=0;i<=half;i++)
			{count+= (int)Math.abs(ar[i]-ar[str.length()-i-1]);
				
			}
	System.out.println(count);
	
	}
	
	}

}
