/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegemanagement;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author junior
 */
public class EmailValidator {
    // Define the pattern for validating emails
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[a-zA-Z0-9._%+-]+@(gmail\\.com|outlook@com|yahoo\\.com|icloud\\.com|protonmail\\.com)$"
    );

    public static void isValid(String email) throws IllegalArgumentException {
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null.");
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid email format: " + email);
        }
    }
}
