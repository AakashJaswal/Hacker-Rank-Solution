import java.util.HashMap;
import java.util.Scanner;


public class day8 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
HashMap<String,String> pb =new HashMap<>();
int n=sc.nextInt();
sc.nextLine();
for(int i=0;i<n;i++)
    {String str=sc.nextLine();
    String[] ar= str.split(" ");
      pb.put(ar[0], ar[1]);
	}
while(sc.hasNext())
       { String qeu=sc.nextLine();
         if(pb.containsKey(qeu))
        	 System.out.println(qeu+"="+pb.get(qeu));
         else 
        	 System.out.println("Not found");
       }
sc.close();
System.exit(0);
	}

}
