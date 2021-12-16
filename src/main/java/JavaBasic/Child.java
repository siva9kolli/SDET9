package JavaBasic;

import org.testng.annotations.Test;

public class Child extends Parent{

    public void sum(int a, int b){
        int c;
        c = a+b+ 60;
        System.out.println("Add two varibales ==== " + c);
    }

    public void sum(int a, int b, int d){
        int c;
        c = a+b+ d + 100;
        System.out.println("Add two varibales ==== " + c);
    }

@Test
    public void testMethodOverRiding(){
        sum(10, 2);
        sum(1,2,3);
}

}
