package Vigenère;

import java.util.Scanner;
//https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher
public class Cipher {
    public static final char[] VigenereTable = new char[0];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  plainText = input.nextLine();
        String keyword = input.next();
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            key.append(keyword.charAt(Math.floorMod(i, keyword.length())));
        }
        System.out.println(key);
    }
    public final char[][] VigenereTable =
}
