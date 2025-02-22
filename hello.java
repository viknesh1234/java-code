import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner scan = new Scanner( System.in );
         String name = scan.nextLine();
         double mark = scan.nextDouble();
         scan.nextLine();
         String department = scan.nextLine();
         System.out.println("my name is " + name);
         System.out.println("my mark is " + mark/10 + "/10");
        System.out.print("my department is " + department);
        
       
    }
}