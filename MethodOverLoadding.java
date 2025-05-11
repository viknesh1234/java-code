import java.util.*;

public class MethodOverLoadding {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        System.out.println("The sum of two numbers is:");
        MethodOverLoadding obj = new MethodOverLoadding();
        obj.sum(a, b);
        obj.sum(a, b, c);
    }
}