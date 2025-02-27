public class mobliefun {
    void Iphone()
    {
        System.out.println("this is iphone 15");
    }
    void samsung()
    {
        System.out.println("this is samsung s series");
    }
    void vivo()
    {
        System.out.println("this is vivo phone ");
        samsung();
    }

    public static void main(String[] args) {
        mobliefun ph = new mobliefun();
        ph.Iphone();
        ph.vivo();
    }
}
