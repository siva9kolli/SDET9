package Strings;

import org.testng.Assert;
import org.testng.annotations.Test;
import sun.jvm.hotspot.tools.SysPropsDumper;

public class StringTest {
    @Test
    public void comparingEquals(){
        String s1 = "Selenium";
        String s2 = new String("Selenium");

        //equals method : refer to values of the string
        if(s1.equals(s2)){
            System.out.println("Both are equal");
        } else{
            System.out.println("Both are not equal");
        }

        System.out.println("===========================*************==================");
        // == refer to reference value in the memory
        if(s1 == s2){
            System.out.println("Both are equal");
        } else{
            System.out.println("Both are not equal");
        }
    }

    @Test
    public void stringAdding(){
        int i = 5;
        String s2;
        String s1 = "Appium";
        //s2 = s1.concat(" Automation");
        s2 = s1 + " Automation";
       // System.out.println("String value " + s2);
        System.out.println("String value " + s2 +( i + i));
    }

    @Test
    public void comparisions(){
        String s1 = "Selenium";
        String s2 = "Appium";
        String s3 = "APPIUM";

        String s4 = null;

        s4 = s2.toUpperCase();

        if(s2.equals(s3)){
            System.out.println("Both are not equal");
        } else if(s2.equalsIgnoreCase(s3)){
            System.out.println("Case is ignored");
        }

        Assert.assertTrue(s4.equals(s3));
        Assert.assertEquals(s4,s3);
        Assert.assertFalse(s1.equals(s2));

        System.out.println("Substring ===== " + s3.substring(3));
        System.out.println("Substring ==== " + s3.substring(0,3));
    }

    @Test
    public void stringFunctions(){
        String s1 = "I Love Selenium";
        String s2 = "I Love Appium";
        String s3 = " Automation Testing       ";
        String s4 = "Automation Testing";
        String s5 = "$ 10.00";
        String s6 = "& 10.00";
        String s7 = "Test123";

        Assert.assertTrue(s1.contains("I Love"));
        Assert.assertTrue(s2.startsWith("I"));
        Assert.assertTrue(s2.endsWith("Appium"));
        System.out.println("Trim  === " + s3.trim());
        Assert.assertTrue((s3.trim()).equals(s4));
        String actualvalue = s5.replace("$", "").trim();
        System.out.println("actualvalue == " + actualvalue);

        String actualNumbers1 = s7.replaceAll("[A-Z]", "");
        String actualNumbers2 = s7.replaceAll("[a-z]", "");
        String actualNumbers3 = s7.replaceAll("[0-9]", "");
        System.out.println("actualNumbers1 == " + actualNumbers1);
        System.out.println("actualNumbers2 == " + actualNumbers2);
        System.out.println("actualNumbers3 == " + actualNumbers3);
    }

    @Test
    public void reverseAString(){
        String s1 = "amlet";
        String reverse = "";

        char chr[] = s1.toCharArray();
        for(int i=0; i< chr.length; i++){
            System.out.println("chr array == "  +chr[i]);
        }

        for( int j = chr.length -1; j>=0; j--){
            reverse = reverse + chr[j];
        }
        System.out.println("reverse === " + reverse);
    }

    @Test
    public void reverse1(){
        String s1 = "amlet";
        String reverse = "";

       for(int i = s1.length()-1; i>=0; i--){
           reverse = reverse + s1.charAt(i);
       }
        System.out.println("reverse with using charAT === " + reverse);
    }
}
