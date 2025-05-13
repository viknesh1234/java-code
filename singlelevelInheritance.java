class animal{
	void eat() {
		System.out.println("animal is eat");
	}
}

class dog extends animal{
	void bark() {
		System.out.println("dog is bark");
	}
}
public class singlelevelInheritance {

	public static void main(String[] args) {
		dog t1 = new dog();
//		t1.bark();
		t1.eat();
		

	}

}