package EncryptionAndDecryption;

import java.util.Base64;

public class Encryption {
public static void main(String[] args) {
		
		String passwordText = "rkiran";
		byte[] passwordTextInBytes = passwordText.getBytes();
		
		String encodedStringPassword = Base64.getEncoder().encodeToString(passwordTextInBytes);
		System.out.println(encodedStringPassword);

	}

}
