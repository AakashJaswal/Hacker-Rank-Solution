import java.util.HashSet;
import java.util.Scanner;



public class panagram {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
HashSet<Character> un=new HashSet<Character>();
st=st.replace(" ", "");
st=st.toLowerCase();
for(int i=0;i<st.length() ;i++)
 un.add(st.charAt(i));
int size=un.size();
if(size==26)
	System.out.println("pangram");
else 
	System.out.println("not pangram");
	}

}
