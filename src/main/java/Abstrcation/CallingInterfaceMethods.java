package Abstrcation;

import org.testng.annotations.Test;

public class CallingInterfaceMethods extends ConstructInterfaceTest{

    public static void main(String args[]){
        InterfaceTest interfaceTest = new CallingInterfaceMethods();
        interfaceTest.test1();
        interfaceTest.test2();
        interfaceTest.test3();
    }
}
