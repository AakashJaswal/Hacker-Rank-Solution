 import java.util.*;

public class datetoword {

public static void main(String[] args) {

Scanner sc=new Scanner (System.in);
    String time[]= 
   {" ","one ","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","half"};
    int h=sc.nextInt();
    int m=sc.nextInt();
    if(m==0)
        System.out.print(time[h]+" o' clock");
    else if(m==1)
        System.out.print("one minute past "+time[h]);
    else if(m<30&&m!=15)
         System.out.print(time[m]+" minutes past "+time[h]);
    else if(m==30)
        System.out.print(time[m]+" past "+time[h]);
    else if(m>30 && m!=45)	
      System.out.print(time[60-m]+" minutes to "+time[h+1]);
    else if(m==45)
    System.out.print("quarter to "+time[h+1]);
    else 
    	System.out.print("quarter past "+time[h]);
}

}