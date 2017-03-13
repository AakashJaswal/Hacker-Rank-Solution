


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class timechange {

	
	    public static void main(String[] args)
	    {	Scanner sc=new Scanner(System.in);
	    	String st=sc.nextLine();
	    	SimpleDateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");


	    	SimpleDateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");
	    	Date date = null;
	    
	    	try
	    	{
	    	    date = inFormat.parse(st);
	    	    
	    	}
	    	catch ( Exception e )
	    	{
	    	        e.printStackTrace();
	    	}
	    	if( date != null )
	    	{
	    	    String myDate = outFormat.format(date);
	    	    System.out.println(myDate);

	    	}
	    }
	}

