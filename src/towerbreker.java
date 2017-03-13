import java.util.Scanner;
		
public class towerbreker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{ int num1=sc.nextInt();
		int num2=sc.nextInt();
        String res= findWinner(num1,num2);
        System.out.println(res);
t--;		}

		  }

	private static String findWinner(int x, int y) {
		   x=x%4; 
		    y=y%4;
		    if((y==0)||(y==3)||(x==0)||(x==3)) return "First";
		    return "Second";
		}

	
		  }    