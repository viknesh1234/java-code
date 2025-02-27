

import java.security.*;
import java.util.Base64;
import java.util.Scanner;

public class ExNo03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text:");
        String msg = sc.nextLine();
        sc.close();
        
        // Generate Key Pair
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DSA");
        keyPairGen.initialize(2048);
        KeyPair pair = keyPairGen.generateKeyPair();
        PrivateKey privKey = pair.getPrivate();
        
        // Create Signature
        Signature sign = Signature.getInstance("SHA256withDSA");
        sign.initSign(privKey);
        sign.update(msg.getBytes());
        
        // Generate Signature
        byte[] signature = sign.sign();
        System.out.println("Digital signature for given text: " + Base64.getEncoder().encodeToString(signature));
    }
}
