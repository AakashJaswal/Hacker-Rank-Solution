import java.util.*;
class shashstring {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        char[] str = B.toCharArray();
        
        int count=0;
        for(int i=0;i<str.length-2;i++){
            if(str[i]=='0' && str[i+1]=='1' && str[i+2]=='0') {count++; str[i+2]='1';}
        }
        
        System.out.println(count);
    }
}
