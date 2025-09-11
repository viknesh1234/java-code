public class GCDofARRAY {
    public static int gcd(int  a, int  b){
        while(b!=0){
            int t = b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public static int findgcd(int[] nums ){
        int result = nums[0];
        for(int i = 1; i<nums.length; i++){
        result = gcd(result, nums[i]);  // 0 = 24, 1=60 
        }
        return result;
    }
   
    public static void main(String[] args) {
        int [] arr = { 24, 60,30, 40 , 50 ,68 };
        System.out.println("GCD = " + findgcd(arr));
    }
}
