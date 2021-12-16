package JavaBasic;

import org.testng.annotations.Test;

public class Parent {

   // @Test
    public void testingMethodOverLoading(){
    sum(1,2,3);
    sum(1,2);
    sum(1,200000);
    }

    public void sum(int a, int b){
        int c;
        c = a+b;
        System.out.println("Add two varibales ==== " + c);
    }

    public void sum(int a, int b, int d){
        int c;
        c = a+b+ d;
        System.out.println("Add two varibales ==== " + c);
    }

    public void sum(int a, double b){
        double c;
        c = a+b;
        System.out.println("Add two varibales ==== " + c);
    }
}
