import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class closest {
	

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int i,k=0;
int min=Integer.MAX_VALUE;
int ar[]=new int[s];
HashSet<Integer> h=new HashSet<>();
for(i=0;i<s;i++)
	ar[i]=sc.nextInt();
Arrays.sort(ar);
for(int j=0;j<s-1;j++){
for( i=j;i<s-1;i++)

	{if(Math.abs(ar[i+1]-ar[i])<min)
	{	min=Math.abs(ar[i]-ar[i+1]);k=i; }
	}h.add(ar[k]);
	h.add(ar[k+1]);
}
Object[] as=new Object[h.size()];
as=h.toArray();
Arrays.sort(as);
for(Object x: as)
{System.out.print(x+" ");}
    }

}
