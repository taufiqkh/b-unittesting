package jfisher.logic.test;

import jfisher.logic.*;
import jmunit.framework.blackberry.*;

public class DistanceConversionTest {
    Assertion a = new Assertion();
    public void testfeetToMeters() throws AssertionFailedException {
        System.out.println("feetToMeters");
        float result = DistanceConversion.feetToMeters(25);
        a.assertEquals("feetToMeters", 7.62F, result);
    }
    
    public void testmetersToFeet() throws AssertionFailedException {
        System.out.println("metersToFeet");
        float result = DistanceConversion.metersToFeet(5);
        a.assertEquals("metersToFeet", 16.404999F,result);
    }
    
    public void testmilesToKM() throws AssertionFailedException {
        System.out.println("milesToKM");
        jfisher.logic.DistanceConversion instance = null;
        float result = DistanceConversion.milesToKM(26.2F);
        a.assertEquals("milesToKM", 42.1558F,result);
    }
    
    public void testkmToMiles() throws AssertionFailedException {
        System.out.println("kmToMiles");
        float result = DistanceConversion.kmToMiles(2);
        a.assertEquals("kmToMiles", 1.2428F, result);
    }
    
    public void testLongerThan() throws AssertionFailedException {
        System.out.println("longerThan");
        a.assertTrue("longerThan", 500F<(DistanceConversion.kmToMiles(1)*5280));
    }
    
    public void setUp() {
    }
    
    public void tearDown() {
    }
    
    public void test(int testNumber) throws Throwable {
        switch(testNumber) {
            case 0:testfeetToMeters();break;
            case 1:testmetersToFeet();break;
            case 2:testmilesToKM();break;
            case 3:testkmToMiles();break;
            case 4:testLongerThan();break;
            default: break;
        }
    }
}
