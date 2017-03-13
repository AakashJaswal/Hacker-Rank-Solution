import java.util.Scanner;
import java.util.TreeSet;


public class manandstone {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		while(test!=0){int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		TreeSet<Integer> sor=new TreeSet<>();
		for (int i=0;i<n;i++)
			sor.add(a*i+b*(n-1-i));
		for(int x:sor)
			System.out.print(x+" ");
		System.out.println("");
	}}
	

}
