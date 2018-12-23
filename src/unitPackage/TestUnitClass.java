package unitPackage;

import java.lang.Exception;

import org.testng.Assert;

public class TestUnitClass {

    public static void main(String[] args) {

        try {

            UnitClass test = new UnitClass();

            int resultOfaddition = test.addition(7, 15);

            Assert.assertEquals(22, resultOfaddition);

            int resultofsubtraction = test.subtraction(45, 10);

            Assert.assertEquals(resultofsubtraction, 35);
        }catch (AssertionError e){
            System.out.println("Test Failed");
        }

    }
}

//update now
