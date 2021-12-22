package Loops;

import jdk.nashorn.internal.ir.WhileNode;
import org.testng.annotations.Test;

public class Conditions {

    @Test
    public void testConditions(){
        int age = 79;

        if(age < 18){
            System.out.println("Not eligible for applying driving license");
        } else if(age > 80){
            System.out.println("Not eligible for applying driving license");
        } else if(age >18 && age <80){
            System.out.println("Eligible for applying driving license");
        }
    }

    @Test
    public void testSimpleIf(){
        String s= "Selenium";
        if(s.equals("Appium")){
            System.out.println("Apply for Mobile Automation");
        } else {
            System.out.println("Apply for Web Automation");
        }
    }

    @Test
    public void testWhile(){
        int a = 1;
        while (a <= 5){
            a++;
        System.out.println("Testing while " + a);
        }
    }
}
