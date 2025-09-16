import java.util.*;

public class coprime {
    public List<Integer> merge(int[] arr) {
        List<Integer> stack = new ArrayList<>();
        for (int num : arr) {
            stack.add(num);
            while (stack.size() > 1) {
                int a = stack.get(stack.size() - 2);
                int b = stack.get(stack.size() - 1);
                int g = gcd(a, b);

                if (g == 1) {
                    break; 
                }

                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                long lcm = (long) a / g * b;
                stack.add((int) lcm);
            }
        }
        return stack;
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        coprime obj = new coprime();
        List<Integer> result = obj.merge(arr);

        System.out.println("Final merged array: " + result);
    }
}
