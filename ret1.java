public class ret1 {
    int sum (int a,int b)
    {
        int c = a+b;

        return c;------
    }
    public static void main(String[] args) {
        ret1 obj = new ret1();
        int remainder = obj.sum (20,20);
        System.out.println(remainder);

    }
}
