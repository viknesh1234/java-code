public class addpara {
    void sum(int num1,int num2)
    {
        System.out.println(num1+num2);
    }
    void sub(int num1,int num2)
    {
        System.out.println(num1-num2);
    }
    void multiple(int num1,int num2)
    {
        System.out.println(num1*num2);
    }
    void div(int num1,int num2)
    {
        System.out.println(num1/num2);
    }

    public static void main(String[] args) {
        addpara obj = new addpara();
        obj.sum(10,2);
        obj.sub(55,27);
        obj.multiple(10,27);
        obj.div( 10,55);
    }
}
