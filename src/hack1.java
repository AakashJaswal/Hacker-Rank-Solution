import java.io.*;
import java.util.*;

public class hack1 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int al[]=new int[3];
    int bo[]=new int[3];
        int a=0,b=0,i;
        for(i=0;i<3;i++)
        al[i]= sc.nextInt();
        for(i=0;i<3;i++)
        bo[i]= sc.nextInt();
        for(i=0;i<3;i++)
        {
        	if(al[i]>bo[i])
        		a++;	
        	else if(al[i]<bo[i])
            		b++;
        	else
        		continue;
        }
    
    System.out.println(a+" "+b);
    
            
System.exit(0);
    }
}