import java.util.Scanner;

public class school {
    String passorfail(int score) {
        if (score < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_mark = scan.nextInt();
        school obj = new school();
        String result = obj.passorfail(total_mark);
        System.out.println(result);
    }
}
