public class foreach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("-----------------");
        // Example with String array
        String[] str = {"Hello", "World", "Java"};
        for (String s : str) {
            System.out.println(s);
        }
    }
}
