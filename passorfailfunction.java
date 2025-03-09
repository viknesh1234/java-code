//Here is the extracted text from the image:

// - Create a class called **"School"** with main function  
// - Create a function called **passorfail** which should return the string **"Pass/Fail"**  
// - Inside **Main** function get integer input from user for total mark.  
// - Pass that input to the **passorfail** function and let the function decide whether the student is pass or fail.



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
        int b = scan.nextInt();
        passorfailfunction obj = new passorfailfunction();
        String result= obj.school(b); 
        System.out.println(result);
    }
}
