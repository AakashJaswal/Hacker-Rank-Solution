import java.util.Scanner;


class SPALNUM {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double i,low,high,sum=0,temp,max;
int test,dig=0;
test=sc.nextInt();
while(test!=0)
     {max=0;
	low=sc.nextDouble();
       high=sc.nextDouble();
	   for(i=low;i<=high;i++)
         { temp=i;
            while(temp!=0)
            { dig= dig%10;
               temp=temp/10;
                sum+=dig;
              }
    	 if(sum==temp)
    		 max+=temp;
    	 else
    		 continue;
         }
	System.out.println(max);
     }
System.exit(0);
	}

}
