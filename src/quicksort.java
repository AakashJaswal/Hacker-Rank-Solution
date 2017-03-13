import java.util.Scanner;


public class quicksort {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        quickSort(a,0,n-1);
    }
    
 public static void quickSort(int A[],int p, int r)
    {
        int q;
        if(p<r)
        {
            q=partition(A,p, r);

            for(int i=0; i<A.length;i++){
                System.out.print(A[i] +" ");
            }
            System.out.println();

            quickSort(A,p, q-1);
            quickSort(A,q+1, r);
        }
    }
    public static int partition(int A[],int p, int r){
        int tmp;
        int x = A[r];
        int i = p-1;

        for(int j=p; j<=r-1; j++)
        {
            if(A[j]<=x)
            {
                i++;
                tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
        }
        tmp=A[i+1];
        A[i+1]=A[r];
        A[r]=tmp;
        return i+1;
    }
}