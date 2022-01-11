package powerpackage;

public class powerfinder {
    public static int OF(int base, int exponent) {
        int originalBase = base;
        while (exponent-- > 0){
            base*=originalBase;
        }
        return base;
    }
}
