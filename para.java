public class para {
    void soap(int money)
    {
        System.out.println(money);
        System.out.println("soap purchased");
    }
    void chocolate(int money)
    {
         System.out.println(money);
        System.out.println("chocolate purchased");
    }
    void powder(int money)
    {
        System.out.println(money);
        System.out.println("powder purchased");
    }

    public static void main(String[] args) {
        para obj = new para();
        obj.soap(20);
        obj.chocolate(45);
        obj.powder(50);
        

    }
    
}
