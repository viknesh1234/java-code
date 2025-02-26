import java.util.Scanner;
public class demo {          // det input for variable a. input should be greater than 10; if input is not greater than 10 ask the user to re enter until he types the right input
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =0;
        do{
            System.err.println("enter grater then 10 : ");
            a =scan.nextInt();
            a =a++;
        }while(a<10);
        
 
    
}
}