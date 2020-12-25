package Functions;

public class ModularMultiplicativeInverse {
    static boolean is(int a, int aInverse, int m) {
        if ((a*aInverse) % m == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
