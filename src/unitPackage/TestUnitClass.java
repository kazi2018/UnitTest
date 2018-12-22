package unitPackage;

import org.testng.Assert;

public class TestUnitClass {

    public static void main(String[] args) {

        UnitClass test = new UnitClass();

        int resultOfaddition = test.addition(7, 15);

        Assert.assertEquals(24,resultOfaddition);

        int resultofsubtraction = test.addition(45, 10);

        Assert.assertEquals(resultOfaddition, 35);

    }
}
