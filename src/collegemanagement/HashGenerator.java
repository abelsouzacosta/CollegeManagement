/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegemanagement;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author junior
 */
public class HashGenerator {
    public static String generateSHA256(String input) throws NoSuchAlgorithmException  {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (int index = 0; index < hash.length; index += 1) {
                String hex = Integer.toHexString(0xff & hash[index]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
        
            return hexString.toString();
        } catch (NoSuchAlgorithmException exception) {
            throw new NoSuchAlgorithmException("Unable to generate hashcode due to missing algorithm SHA-256",exception);
        }
    }
}
