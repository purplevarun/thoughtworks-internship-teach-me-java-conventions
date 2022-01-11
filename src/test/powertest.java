package powerpackage;

import org.junit.Test;

public class powertest {
    @Test
    public void oneRaisedtoOneisOne() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneisTwo() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoisFour() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void ThreeRaisedToTwoisNine() {
        assert powerfinder.OF(3, 2) == 9;
    }
}
