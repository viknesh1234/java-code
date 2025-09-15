import java.util.*;
public class cantype {
    public int countWords(String Str, String Str1){
        String[] word = Str.split(" ");
        int count = 0;
        for(String w : word){
            boolean found = true;
            for(char c : Str1.toCharArray()){
                if(w.indexOf(c) !=-1){
                    found = false;
                    break;
                }
            }
            if(found)
            count ++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the borken letters : ");
        String Str1 = sc .nextLine();
        System.out.println("Enter the text you want count : ");
        String str = sc.nextLine();
         cantype find = new cantype();
         System.out.println(find.countWords(Str1, str));
    }
}
