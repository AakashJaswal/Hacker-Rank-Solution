import java.util.Scanner;


public class pdfviewer {
		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = 26;
	        int h[] = new int[n];
	        for(int h_i=0; h_i < n; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        String word = in.next();
	        int len= word.length();
	        int max=0;
	        for(int i=0;i<len;i++)
	        { char temp=word.charAt(i);
	        	max=max< h[temp-97]?h[temp-97]:max;
	        	
	        }
	        System.out.println(len*max);
	}

}
