package com.codewars;

public class SimpleEncryption {

	public static String encrypt(final String text, final int n) {
		if (n <= 0) {
			return text;
		}

		String result = text;

		StringBuilder sb = new StringBuilder("");
		StringBuilder sb2 = new StringBuilder("");

		for (int k = n; k > 0; k--) {
			for (int i = 0; i < result.length(); i++) {
				if ((i + 1) % 2 == 0) {
					sb.append(result.charAt(i));
				} else {
					sb2.append(result.charAt(i));
				}
			}
			result = sb.append(sb2).toString();
			sb.delete(0, sb.length());
			sb2.delete(0, sb2.length());
		}

		return result;
	}

	public static String decrypt(final String encryptedText, final int n) {
		if (n <= 0) {
			return encryptedText;
		}

		String temp = encryptedText;

		char[] result = new char[temp.length()];

		for (int k = n; k > 0; k--) {
			for (int i = 0; i < temp.length() / 2; i++) {
				result[2 * i + 1] = temp.charAt(i);
			}

			for (int i = temp.length() / 2; i < temp.length(); i++) {
				result[2 * (i - temp.length() / 2)] = temp.charAt(i);
			}
			temp = new String(result);

		}

		return new String(result);
	}

}
