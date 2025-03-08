//Here is the extracted text from the image:
//- Create a class called **"Find"** with main function  
//- Create a function called **evenodd** with integer parameter called **int num**  
//- Inside **Main** function get integer input from user.  
//- Pass that input to the **evenodd** function and let the function decide whether the number is even or odd.  




import java.util.Scanner;
public class find {
    void evenorodd(int num){
if(num%2 ==0){
    System.out.println("even number");
}
else{
    System.out.println("ood number");
}
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        find obj = new find();
        obj.evenorodd(a);
    }
}
