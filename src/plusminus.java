import java.util.*;


public class plusminus {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Float> al = new ArrayList<Float>();
    float el,le=0,eq=0,gr=0;
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
	{  el=sc.nextFloat();
		al.add(el);
	if(el<0)
		le++;
	else if(el>0)
		gr++;
	else 
		eq++;
		
		
	}
	System.out.println(gr/n);
	System.out.println(le/n);
	System.out.println(eq/n);
	}

}
