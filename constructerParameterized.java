public class constructerParameterized {

	String id;
	int acc;
	int ph;
	
	constructerParameterized (String a, int b, int c)
	{
	id = a;
	acc=b;
	ph = c;
	}
	public String toString(){
		return id + acc + ph;
	}
	public static void main(String[] args) {
		constructerParameterized ob1 = new constructerParameterized ("abc", 123, 12345);
		// constructerParameterized ob2 = new constructerParameterized (45, "Mark");
	    // System.out.println(ob2.marks );
        System.out.println(ob1);
	}
	
}
// The above code defines a class named `constructerParameterized` with a parameterized constructor.
// The constructor takes two parameters: an integer `a` and a string `b`, which are used to initialize the instance variables `marks` and `name`.