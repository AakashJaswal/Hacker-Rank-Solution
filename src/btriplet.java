import java.util.*;

public class btriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int count = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++)
			hm.put(i, sc.nextInt());

		for (int i = 0; i < hm.size(); i++)
			if (hm.containsValue(hm.get(i) + p)
					&& hm.containsValue(hm.get(i) + 2 * p))
				count++;
		System.out.println(count);
	}
}
