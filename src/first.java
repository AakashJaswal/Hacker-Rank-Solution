class emplo{
 int i;
  emplo(String s)
	{ 
		System.out.println("Hello"+s);
		
	}
}//end

class first {
	

	public static void main(String[] args) {
		emplo emp = new emplo("Aakash");
		System.out.println(emp.i);//i is coming as 0
		
	System.out.println("application done");
	}

}
