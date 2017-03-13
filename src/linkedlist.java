import java.util.Scanner;

class link{
	int data;
	link next;
	link()
	{next=null;}
	
}
public class linkedlist {
public static void main (String args[]){
	char c='y';
	Scanner sc =new Scanner(System.in);
	link s=new link();
	link t=s;
	while(true){
		System.out.print("enter variable ");
		s.data=sc.nextInt();
		System.out.print("more ? ");
		c=sc.next().charAt(0);
		if(c=='y'||c=='Y'){
		s.next=new link();
		s=s.next;
		}
		else break;
	}
	s=t;
	while(s!=null)
	{System.out.print(s.data+"-->");
		s=s.next;
	}
System.out.print("NULL");
}

}
