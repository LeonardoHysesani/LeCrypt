package Functions;

public class GreatestCommonDenominator {
    static int of(int a, int b) {
        if (a == 0 || b == 0) {
            return  0;
        }
        if (a == b) {
            return b;
        }
        if (a > b) {
            return GreatestCommonDenominator.of(a-b, b);
        }
        else {
            return GreatestCommonDenominator.of(a, b-a);
        }
    }
}
