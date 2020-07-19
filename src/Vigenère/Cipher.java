package Vigenère;

import Alphabets.Vigenere;
import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        System.out.println("Vigenère Cipher");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text to be encrypted/decrypted (letters of the english alphabet and whitespaces are the only valid characters): ");
        String plainText = input.nextLine();
        String upperPlainText = plainText.toUpperCase();
        char[] cipherTextChars = upperPlainText.toCharArray();

        System.out.print("Enter keyword: ");
        String keyword = input.next();
        keyword = keyword.toUpperCase();

        int operation;
        do {
            System.out.print("Operations:" + "\n" + "Encryption - (1)" + "\n" + "Decryption - (2)" + "\n" + "Choose: ");
            operation = input.nextInt();
        } while (operation != 1 && operation != 2);

        input.close();


        for (int i = 0; i < cipherTextChars.length; i++) {
            for (int row = 0; row < 26; row++) {
                if (Vigenere.table[row][0] == keyword.charAt(Math.floorMod(i, keyword.length()))) {
                    switch (operation) {
                        case 1 -> cipherTextChars[i] = encode(row, cipherTextChars[i]);
                        case 2 -> cipherTextChars[i] = decode(row, cipherTextChars[i]);
                    }
                }
            }
        }
        System.out.println("Result:");
        System.out.println(cipherTextChars);
    }

    public static char encode(int row, char letter) {
        for (int col = 0; col < 26; col++) {
            if (letter == Vigenere.table[0][col]) {
                letter = Vigenere.table[row][col];
                break;
            }
        }
        return letter;
    }


    public static char decode(int row, char letter) {
        for (int col = 0; col < 26; col++) {
            if (letter == Vigenere.table[row][col]) {
                letter = Vigenere.table[0][col];
                break;
            }
        }
        return letter;
    }
}
