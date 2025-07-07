public class Return {
    String getadd(){
        String add1= "New York";
        String add2= "Los Angeles";
        String adds = add1 + " and " + add2;
        return adds;
    }
    public static void main(String[] args) {
        Return addd = new Return();
        String adds = addd.getadd();
        System.out.println("The addresses are: " + adds);
    }
}
