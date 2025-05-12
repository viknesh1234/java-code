public class constructerParameterized {

	int marks;
	String name;
	
	constructerParameterized (int a, String b)
	{
	marks = a;
	name=b;
	}
	public static void main(String[] args) {
		constructerParameterized ob1 = new constructerParameterized (32, "John");
		constructerParameterized ob2 = new constructerParameterized (45, "Mark");
	    System.out.println(ob2.marks );
        System.out.println(ob1.name);
	}
	
}
// The above code defines a class named `constructerParameterized` with a parameterized constructor.
// The constructor takes two parameters: an integer `a` and a string `b`, which are used to initialize the instance variables `marks` and `name`.