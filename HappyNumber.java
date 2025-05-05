
import java.util.*;
public class HappyNumber {
    public boolean isSolution(int n){
        Set<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int sum =0;

            while(n!=0){
                int num = n%10;
                sum += Math.pow(num,2);
                n =n/10;
            }
            n = sum;
        }
        return n==1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        HappyNumber mv = new HappyNumber();
        if(mv.isSolution(n)){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not a Happy Number");
        }
    }
}
