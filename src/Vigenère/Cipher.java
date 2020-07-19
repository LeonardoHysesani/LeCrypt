package Vigenère;

import java.util.Scanner;

//https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher
public class Cipher {
    public static void main(String[] args) {
        System.out.println("Caesar Cipher");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text to be encrypted/decrypted (letters of the english alphabet and whitespaces are the only valid characters): ");
        String plainText = input.nextLine();



        int operation;
        do {
            System.out.print("Operations:" + "\n" + "Encryption - (1)" + "\n" + "Decryption - (2)" + "\n" + "Choose: ");
            operation = input.nextInt();
        } while (operation != 1 && operation != 2);

        input.close();

        String upperPlainText = plainText.toUpperCase();
        char[] cipherTextChars = upperPlainText.toCharArray();

        for (int i = 0; i < cipherTextChars.length; i++) {
            for (int j = 0; j < 26; j++) {
                if (Alphabets.Vigenere.table[i][j] == cipherTextChars[i]){
                    switch (operation) {
                        case 1 -> cipherTextChars[i] = encode();
                        case 2 -> cipherTextChars[i] = decode();
                    }
                    break;
                }
            }
        }
        System.out.println("Result:");
        System.out.println(cipherTextChars);
    }


    public static char letter;

    public static char encode() {

        return letter;
    }


    public static char decode() {
        return letter;
    }
}
