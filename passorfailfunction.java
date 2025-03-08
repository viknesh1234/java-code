import java.util.Scanner;
public class passorfailfunction {
    String school(int score)
    {
        if(score<35)
        {
            return "fail";
        }
        else{
            return "pass";
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        passorfailfunction obj = new passorfailfunction();
        String result= obj.school(a); 
        System.out.println(result);
    }
}
