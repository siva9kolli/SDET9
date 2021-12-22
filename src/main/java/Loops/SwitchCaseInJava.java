package Loops;

import org.testng.annotations.Test;

public class SwitchCaseInJava {

    @Test
    public void switchCaseTest(){
        int number = 4;
        switch (number){
            case 1 : System.out.println("Test 1");
            break;
            case 2 : System.out.println("Test 2");
            break;
            case 3 : System.out.println("Test 3");
            break;
            case 4 : System.out.println("Test 4");
            break;
            case 5 : System.out.println("Test 5");
            break;
            default: System.out.println("No number is matched");
        }
    }

    @Test
    public void daysTest(){
        String day="Wednesday";

        switch (day){
            case "Sunday" : System.out.println("Sunday");
            break;
            case "Monday" : System.out.println("Monday");
            break;
            case "Tuesday" : System.out.println("Tuesday");
            break;
            case "Wednesday" : System.out.println("Wednesday");
            break;
            case "Thursday" : System.out.println("Thursday");
            break;
            case "Friday" : System.out.println("Friday");
            break;
            case "Saturday" : System.out.println("Saturday");
            break;
            default:  System.out.println("Holiday");
        }
    }
}
