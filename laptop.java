public class laptop {
    String brand ="";
    String proc = "";
    int ram = 0;
    int price = 0;
    public static void main(String[] args) {
        laptop device1 = new laptop();
        device1.brand = "HP";
        device1.proc = "i6";
        device1.ram = 8;
        device1.price  = 45000;

        System.err.println(device1.price);
    }
}
