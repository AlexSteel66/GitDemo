package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNG {
    @Test
    public void testMethod1(){
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        Assert.assertEquals(result, 3);
        System.out.println("Running Test -> testMethod1");
    }

    @Test
    public void testMethod2(){
        System.out.println("Running Test -> testMethod2");
        SomeClassToTest obj = new SomeClassToTest();
        String ExpectedString = "Hello World";
        String result = obj.addStrings("Hello", "World");
        Assert.assertEquals(result, ExpectedString);
    }

    @Test
    public void testMethod3() {
        System.out.println("Running Test -> testMethod3");
        int[] expectedArray = {1, 2, 3, 4};
        SomeClassToTest obj = new SomeClassToTest();
        int[] result = obj.getArray();
        Assert.assertEquals(result, expectedArray);
        System.out.println("\nEnd Test -> testArrays");
    }
}
