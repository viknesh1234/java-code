public class thiskey {
    String myname = null;
	
	thiskey()
	{
		System.out.println("hello");
		
	}
	
	void setname(String myname) {
		this.myname = myname;
		
	}

	public static void main(String[] args) {
		
		thiskey t1 = new thiskey();
		t1.setname("mark");
		System.out.println(t1.myname);
		

	}

}

// The `setname` method takes a string parameter `myname` and assigns it to the instance variable `myname` using the `this` keyword to differentiate between the parameter and the instance variable.
// The `this` keyword is used to refer to the current instance of the class, allowing you to access instance variables and methods from within the class.   
