

import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class symmetric {
    public static final String AES = "AES";

    public static void main(String[] args) throws Exception {
        SecretKey symmetricKey = createAESKey();
        System.out.println("The Symmetric Key is: " + bytesToHex(symmetricKey.getEncoded()));
    }

    public static SecretKey createAESKey() throws Exception {
        SecureRandom secureRandom = new SecureRandom();
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
        keyGenerator.init(256, secureRandom);
        return keyGenerator.generateKey();
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02X", b));
        }
        return result.toString();
    }
}
