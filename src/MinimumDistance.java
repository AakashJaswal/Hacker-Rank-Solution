import java.util.HashMap;
import java.util.Scanner;


public class MinimumDistance {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int min=Integer.MAX_VALUE;
	HashMap<Integer,Integer> hm=new HashMap<>();
	for(int i=0;i<n;i++)
	{ Integer val=sc.nextInt();
		if(!hm.containsKey(val))
	         hm.put(val, i);
		else { int num=hm.get(val);
		    int dif=i-num;
		    hm.remove(val);
			if(dif<min)
		    min=dif;
			
	     	}
	}
	min=min==Integer.MAX_VALUE? -1:min;
	System.out.println(min);
		
		
	}
	}

