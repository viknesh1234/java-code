class dad{
	int money = 2000;
}

class son extends dad{
	
}

public class Inheritanceclass {
	public static void main(String[] args) {
		
		son t1 = new son();
		System.out.println(t1.money);
	}

}