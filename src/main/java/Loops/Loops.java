package Loops;

import org.testng.annotations.Test;

public class Loops {

    @Test
    public void verifyForLoop(){
        int b[] = {9,8,7,6,5};
        System.out.println("lenght of array === " + b.length);
        for(int i=0; i<b.length; i++){
            System.out.println("Testing " + i);
            System.out.println("B value " + b[i]);
        }
    }

    @Test
    public void verifyForEachLoop(){
       int a[] = {1,2,3,4,6};
       String s[] = {"Selenium", "Java", "TestNG", "Maven", "Jenkins"};

       for(int i:a){
           System.out.println("For each " + i);
       }

       for(String srt:s){
           System.out.println("Values === " + srt);
       }
    }


}
