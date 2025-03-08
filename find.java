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
