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

        System.out.println(device1.ram);

        laptop device2 = new laptop();
        device2.brand = "HP";
        device2.proc = "i6";
        device2.ram = 8;
        device2.price  = 55000;

        System.out.println(device2.proc);

        laptop device3 = new laptop();
        device3.brand = "HP";
        System.out.println(device3.brand);
    }
}
