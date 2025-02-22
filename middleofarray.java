import java.util.Scanner;
public class middleofarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int size = scan.nextInt();
        int[] mark = new int[size];
        for ( int i =0; i<=size-1; i=i+1){
            mark[i] = scan.nextInt();
        }
        System.out.println("find");
        System.out.println(mark[size/2]);

    }
}
