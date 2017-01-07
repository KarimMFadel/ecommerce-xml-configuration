package com.tornado.ecommerce.common.utils;

import java.io.UnsupportedEncodingException;
import java.rmi.server.UID;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.xml.bind.DatatypeConverter;

import com.google.gson.Gson;
import com.tornado.ecommerce.model.entity.User;

public class Encryptor {

	private String RANDOM_STRING = (new UID()).toString() + (new UID()).toString();
	private static final String UNICODE_FORMAT = "UTF8";
	private static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
	private KeySpec ks;
	private SecretKeyFactory skf;
	private Cipher cipher;
	private byte[] arrayBytes;
	private String encryptionKey;
	private String encryptionScheme;
	private SecretKey key;

	private Encryptor() {
		if (RANDOM_STRING.length() < 25) {
			RANDOM_STRING = "encryptionkeymustbemorethantweentyfourcharacter";
		}
		encryptionKey = RANDOM_STRING;
		encryptionScheme = DESEDE_ENCRYPTION_SCHEME;
		try {
			arrayBytes = encryptionKey.getBytes(UNICODE_FORMAT);
			ks = new DESedeKeySpec(arrayBytes);
			skf = SecretKeyFactory.getInstance(encryptionScheme);
			cipher = Cipher.getInstance(encryptionScheme);
			key = skf.generateSecret(ks);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		}

	}

	private static Encryptor trippleDes;

	public static Encryptor getInstance() {
		if (trippleDes != null)
			return trippleDes;
		trippleDes = new Encryptor();
		return trippleDes;
	}

	public String encrypt(User user) {
		String unencryptedString = new String();
		Gson gson = new Gson();
		unencryptedString = gson.toJson(UserEncrypt.wappedFrom(user));
		String encryptedString = null;
		try {
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
			byte[] encryptedText = cipher.doFinal(plainText);
			encryptedString = new String(DatatypeConverter.printBase64Binary(encryptedText));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptedString;
	}

	public User decrypt(String token) {
		String decryptedText = null;
		try {
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] encryptedText = DatatypeConverter.parseBase64Binary(token);
			byte[] plainText = cipher.doFinal(encryptedText);
			decryptedText = new String(plainText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();
		UserEncrypt userEncrypt = gson.fromJson(decryptedText, UserEncrypt.class);
		return UserEncrypt.wappedTo(userEncrypt);
	}

	/*  For Testing encryption */
	public static void main(String args[]) {

		User user = new User();
		// user.setFirstName("karim");
		user.setLoginName("fadel_91");
		user.setPassword("karim");
		String encrypted = Encryptor.getInstance().encrypt(user);
		User decrypted = Encryptor.getInstance().decrypt(encrypted);

		System.out.println("Encrypted String:  " + encrypted);
		System.out.println("Encrypted String:  " + encrypted.length());
		System.out.println("Decrypted String:  " + decrypted.getFirstName());
		System.out.println("Decrypted String:  " + decrypted.getLoginName());
		System.out.println("Decrypted String:  " + decrypted.getPassword());

	}

	private static class UserEncrypt {
		private String firstName;
		private String loginName;
		private String password;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLoginName() {
			return loginName;
		}

		public void setLoginName(String loginName) {
			this.loginName = loginName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public static UserEncrypt wappedFrom(User user) {
			UserEncrypt userEncrypt = new UserEncrypt();
			if (user.getFirstName() == null) {
				userEncrypt.setFirstName("FiRstNaMeEnCrYpt");
			} else {
				userEncrypt.setFirstName(user.getFirstName());
			}
			userEncrypt.setLoginName(user.getLoginName());
			userEncrypt.setPassword(user.getPassword());
			return userEncrypt;
		}

		public static User wappedTo(UserEncrypt userEncrypt) {
			User user = new User();
			if (userEncrypt.getFirstName().equals(new String("FiRstNaMeEnCrYpt"))) {
				user.setFirstName("");
			} else {
				user.setFirstName(userEncrypt.getFirstName());
			}
			user.setLoginName(userEncrypt.getLoginName());
			user.setPassword(userEncrypt.getPassword());
			return user;
		}
	}
}