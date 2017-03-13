import java.util.Scanner;

public class codeagon1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x1 = sc.nextLong();
		long y1 = sc.nextLong();
		int num = sc.nextInt();
		while (num != 0) {
			long x2 = sc.nextLong();
			long y2 = sc.nextLong();
			x1 -= x2;
			y1 -= y2;
			num--;
		}
		System.out.println(x1 + " " + y1);

	}

}
