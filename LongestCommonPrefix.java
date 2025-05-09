import java.util.*;
public class LongestCommonPrefix {

    public static String prefix(String [] str){
        if(str.length ==0 || str == null){
            return "";
        }

        String prefixx = str[0];

        for(int i=1; i<str.length; i++){
            while(str[i].indexOf(prefixx) !=0){
                prefixx = prefixx.substring(0, prefixx.length() -1);
                if(prefixx.isEmpty())
                return "";

            }
        }
        return prefixx;
    }
        public static void main(String[]args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the no of Strings");
            int n = sc.nextInt();
            sc.nextLine();

            String [] val = new String[n];
            System.out.println("Enter the strings");
            

            for(int i=0; i<n; i++){
                val[i]= sc.nextLine();
            }
            String sol = prefix(val);
            System.out.println("The longest common prefix is: " + sol);
        }
}