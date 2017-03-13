import java.io.*; import java.util.*;

public class lisawo {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int specialProblem = 0;
    int page = 0;
    for(int i = 0; i < n; i++){
        int t = scan.nextInt();
        for(int j = 1; j <= t;j++){
            if(k == 1 || j % k == 1)
                page++;
            if(j == page){
                specialProblem++;
            }
        }
    }
    System.out.println(specialProblem);
}

}