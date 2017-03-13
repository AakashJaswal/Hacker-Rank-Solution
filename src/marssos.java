import java.util.Scanner;


public class marssos {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int count=0;
String str=sc.nextLine();
String m="SOS";
for(int i=0;i<str.length();i++)
{ if(m.charAt(i%3)!=str.charAt(i))
	count++;
	
}
System.out.println(count);
	}

}
