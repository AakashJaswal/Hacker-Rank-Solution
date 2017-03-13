import java.util.Scanner;


public class cloudjump {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cur=1,en=100;
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = sc.nextInt();
        }
        
        for (int i=0;cur!=0;i=cur)
        { cur=(i+k)%n;
         if(c[cur]==1)
           en-=3;
         else 
        	 en--;
         }
        System.out.println(en);

	}

}
