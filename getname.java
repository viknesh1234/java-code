public class getname {
    String getname()
    {
        return "mviknesh";
    }
    String getphone()
    {
        return "Iphone";
    }
    String Address()
    {
        return "vellode";
    }

    public static void main(String[] args) {
        getname obj =new getname();
        String myname = obj.getname();
        String myphone = obj.getphone();
    String myAddress = obj.Address();
    System.out.println(myphone+myname+myAddress);
    }
}
