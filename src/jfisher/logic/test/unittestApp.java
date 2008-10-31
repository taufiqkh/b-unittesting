package jfisher.logic.test;

import net.rim.device.api.ui.UiApplication;
import jmunit.framework.blackberry.*;
/*
 * unittestApp.java
 *
 * Created on November 8, 2006, 10:17 AM
 * RIM Blackberry Application Class
 *
 * @author jfisher
 */
public class unittestApp extends UiApplication {
    private static final String passed = "Pass:";
    private static final String failed = "Fail:";
    private static final String error = "Error:";
    private static final String total = "Total:";
    private static final String time = "Time:";
    private String name;
    private Test test;
    
    public static void main(String[] args){
        unittestApp instance = new unittestApp();
        instance.enterEventDispatcher();
    }
    
    /** Creates a new instance of unittestApp */
    public unittestApp() {
        DistanceConversionTest dct = new DistanceConversionTest();
        try {
            System.out.println("before test");
            dct.test(0);
            dct.test(1);
            dct.test(2);
            dct.test(3);
            System.out.println("after test");
        } catch (Throwable ex) {
            System.out.println("---> " + ex.toString());
            ex.printStackTrace();
        }
        
        pushScreen(new unittestresultsScreen());
        
        /*
        if(Result.isOK()){
            //graphics.setColor(0, 255, 0);
            System.out.println("GREEN");
        }else{
            //graphics.setColor(255, 0, 0);
            System.out.println("RED");
        }
         
        if(Result.getTotalOfTests() != 0){
            //graphics.fillRect(verticalAlignment, barPosition, (barWidth * Result.getRunnedTests()) / Result.getTotalOfTests(), barHeight);
            System.out.println("Runned tests: " +  Result.getRunnedTests() + "\nTotal tests: " + Result.getTotalOfTests());
        }
         
        System.out.println("runned tests = " +  Result.getRunnedTests());
         
        System.out.println(JMUnit.getVersion());
        System.out.println(name);
        System.out.println(passed + String.valueOf(Result.getPassedTests()));
        System.out.println(failed + String.valueOf(Result.getFailedTests()));
        System.out.println(error + String.valueOf(Result.getErrorTests()));
        System.out.println(total + String.valueOf(Result.getTotalOfTests()));
        System.out.println(time + String.valueOf(Result.getTime()) + "ms");
         */
        
        
    }
}


