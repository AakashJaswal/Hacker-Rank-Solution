import java.util.Scanner;


public class isfunny {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for(int i=0; i<cases; i++){
            String word= scan.next();
            if(isFunny(word.toCharArray(),(word.length()-1)))
                System.out.println("Funny");
            else
                System.out.println("Not Funny");                
        }
    }
    
    public static boolean isFunny(char[] word, int size)
        {
        for(int i=0; i<(size); i++){
            int first  = Math.abs(word[i+1]-word[i]);
            int last = Math.abs(word[size-1-i]-word[size-i]);
            if(first!=last)
            
                return false;
            }
        return true;
    }
}
