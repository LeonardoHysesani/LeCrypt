package Caesar;

import Alphabets.English;

import java.util.Scanner;

public class Cipher {

    public static void main(String[] args) {
        System.out.println("Caesar Cipher");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter text to be encrypted/decrypted (letters of the english alphabet and whitespaces are the only valid characters): ");
        String plainText = input.nextLine();

        int shift;
        do {
            System.out.print("Character shift (any positive integer): ");
            shift = input.nextInt();
        } while (shift < 0);

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
                if (Alphabets.English.alphabet[j] == cipherTextChars[i]){
                    switch (operation) {
                        case 1 -> cipherTextChars[i] = encode(shift, j);
                        case 2 -> cipherTextChars[i] = decode(shift, j);
                    }
                    break;
                }
            }
        }
        System.out.println("Result:");
        System.out.println(cipherTextChars);
    }


    public static char letter;

    public static char encode(int shift, int j) {
        if (j + shift > 25) {
            do {
                shift %= 26;
            } while (j + shift > 25);
        }
        letter = English.alphabet[j + shift];
        return letter;
    }


    public static char decode(int shift, int j) {
        if (j - shift < 0) {
            do {
                shift %= 26;
            } while (j - shift < 0);
        }
        letter = English.alphabet[j - shift];
        return letter;
    }
}
