import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class hasmap {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0 ;i<n;i++){
            int number = sc.nextInt();
            if(map.containsKey(number)){
                map.put(number, map.get(number) + 1);
            }
            else{
                map.put(number,1);
            }
        }
        
        
        
        System.out.println(n-Collections.max(map.values()));
    }
}