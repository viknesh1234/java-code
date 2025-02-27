public class garden {
    int appple_price = 20;
    int apple_count = 5;

    void bush()
    {
        System.out.println("total amt = " + apple_count*appple_price);
    }
    public static void main(String[] args) {
        garden apple = new garden();
        apple.bush();
    }
}
