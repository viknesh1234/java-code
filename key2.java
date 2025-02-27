

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;

public class key2 {
    private static final String RSA = "RSA";
    
    public static KeyPair generateRSAKeyPair() throws Exception {
        SecureRandom secureRandom = new SecureRandom();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(RSA);
        keyPairGenerator.initialize(2048, secureRandom);
        return keyPairGenerator.generateKeyPair();
    }
    
    public static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
    
    public static void main(String[] args) throws Exception {
        KeyPair keyPair = generateRSAKeyPair();
        System.out.println("Public Key is: " + bytesToHex(keyPair.getPublic().getEncoded()));
        System.out.println("Private Key is: " + bytesToHex(keyPair.getPrivate().getEncoded()));
    }
}
