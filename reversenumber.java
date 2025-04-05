import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number");
    int num = scanner.nextInt();
    int reverse = 0;
    
    while(num != 0){
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num /= 10;
    }
    System.out.println("reversednumber : " + reverse);
    scanner.close();
}

}