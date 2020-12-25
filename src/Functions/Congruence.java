package Functions;

public class Congruence {
    static boolean areCongruent(int a, int b, int m) {
        if ((a - b) % m == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
