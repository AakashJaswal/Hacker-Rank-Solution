import java.util.Scanner;

public class choclatefeast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			int tch = 0, nch = 0;
			int toch = n / c;
			int wr = toch;
			while (wr >= m) {
				nch = 0;
				nch += wr / m;
				wr = wr % m;
				wr += nch;
				tch += nch;
			}
			System.out.println(tch + toch);
		}
		t--;
	}

}
