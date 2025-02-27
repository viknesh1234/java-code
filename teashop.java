public class teashop {
    int tea = 25;
    int coffee = 55;

    void sales()
    {
        System.out.println(tea+coffee);
    }
public static void main(String[] args) {
    
    teashop customer = new teashop();
    customer.sales();
}
}
