package org.hillel.lesson4;

/**
 * Created by yuriy on 12.11.15.
 */
public class XorEncryptor {

    public static byte[] encode(String pText, String pKey) {
        byte[] txt = pText.getBytes();
        byte[] key = pKey.getBytes();
        byte[] res = new byte[pText.length()];

        for (int i = 0; i < txt.length; i++) {
            res[i] = (byte) (txt[i] ^ key[i % key.length]);
        }

        return res;
    }

    public static String decode(byte[] pText, String pKey) {
        byte[] res = new byte[pText.length];
        byte[] key = pKey.getBytes();

        for (int i = 0; i < pText.length; i++) {
            res[i] = (byte) (pText[i] ^ key[i % key.length]);
        }

        return new String(res);
    }

    public static void main(String[] args) {
        String text = "This TEST string must be encoded";
        String key = "TEST KEY";
        System.out.println(text);
        byte[] encodedString = encode(text, key);
        System.out.println(new String(encodedString));
        String decodedString = decode(encodedString, key);
        System.out.println(decodedString);
    }
}
