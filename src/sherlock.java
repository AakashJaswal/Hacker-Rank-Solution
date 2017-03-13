import java.util.Scanner;


public class sherlock {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int i,N,K,Q,fir,ind;
N=in.nextInt();
K=in.nextInt();
Q=in.nextInt();
int rot=K%N;
int[] arr=new int[N];

for( i=0;i<N;i++)
    arr[i]=in.nextInt();

for( i=0;i<Q;i++)
   {
       int idx=in.nextInt();
       if(idx-rot>=0)
          System.out.println(arr[idx-rot]);
       else
        System.out.println(arr[idx-rot+arr.length]);

	}
	}

}
