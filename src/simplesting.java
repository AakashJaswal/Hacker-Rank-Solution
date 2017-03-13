import java.util.*;
public class simplesting {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
for(int i=1;i<st.length();i++)
{if(st.charAt(i-1)==st.charAt(i))
               { st=st.substring(0,i-1)+st.substring(i+1);
               i=0;}
	
}if(st.length()!=0)
System.out.println(st);
else 
	System.out.println("Empty String");
}

}
