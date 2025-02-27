

class ExNo3 {
    private static long power(long a, long b, long p) {
        long res = 1;
        a = a % p;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % p;
            }
            b = b >> 1;
            a = (a * a) % p;
        }
        return res;
    }

    public static void main(String[] args) {
        long P = 23, G = 9, a = 4, b = 3;
        System.out.println("The value of P: " + P);
        System.out.println("The value of G: " + G);
        System.out.println("The private key a for Alice: " + a);
        System.out.println("The private key b for Bob: " + b);
        
        long x = power(G, a, P);
        long y = power(G, b, P);
        long ka = power(y, a, P);
        long kb = power(x, b, P);
        
        System.out.println("Secret key for Alice: " + ka);
        System.out.println("Secret key for Bob: " + kb);
    }
}
