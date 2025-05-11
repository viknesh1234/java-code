public class constructer {
	
	int marks;
	String name;
	
	constructer()
	{
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		
			constructer var = new constructer();
			constructer var1 = new constructer();
			
			System.out.println(var.marks);
			System.out.println(var1.name);
	}

}
