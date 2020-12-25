package Functions;

public class Coprime {
    static boolean are(int a, int b) {
        if (GreatestCommonDenominator.of(a, b) == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
