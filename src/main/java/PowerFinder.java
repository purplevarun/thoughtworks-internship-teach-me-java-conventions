// package powerpackage;

public class PowerFinder {
    public static int of(int base, int exponent) {
        int originalBase = base;
        while (exponent-- > 0){
            base*=originalBase;
        }
        return base;
    }
}
