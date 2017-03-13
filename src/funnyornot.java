import java.util.Scanner;


public class funnyornot {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String st1=sc.nextLine();
int count=0;
for (int i=0;i<st1.length();i++)
    	  if((st1.charAt(i+1)-st1.charAt(i))!= (st1.charAt(st1.length()-i-1)-st1.charAt(st1.length()-i)) ) 
             count++;
if(count!=0)
	System.out.println("Not Funny");
else 
	System.out.println("Funny");
	}

	}


