/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltm_giuaky;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author khanhs
 */
public class MaHoa {

    public static String SECRET_KEY = "12345678";
    public static SecretKeySpec skeySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "DES");

    public static String maHoa(String originalText) {
        try {
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] byteEncrypted;
            byteEncrypted = cipher.doFinal(originalText.getBytes());
            String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
            return encrypted;
        } catch (IllegalBlockSizeException | BadPaddingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException ex) {
            Logger.getLogger(MaHoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String giaiMa(String encryptText, String key) {
        try {
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] decrypted;
            decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptText));
            return (new String(decrypted));
        } catch (IllegalBlockSizeException | BadPaddingException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException ex) {
            Logger.getLogger(MaHoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Ma Hoa: " + maHoa("Hello"));
        System.out.println("Giai ma: " + giaiMa(maHoa("Hello"), SECRET_KEY));
    }
}
