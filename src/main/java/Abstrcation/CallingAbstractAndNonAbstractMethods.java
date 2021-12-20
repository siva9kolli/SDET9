package Abstrcation;

import org.testng.annotations.Test;

public class CallingAbstractAndNonAbstractMethods extends ConstructAbstractTest{

    public static void main(String args[]){
        CallingAbstractAndNonAbstractMethods callingAbstractAndNonAbstractMethods = new CallingAbstractAndNonAbstractMethods();
        AbstractTest abstractTest = new CallingAbstractAndNonAbstractMethods();
        ConstructAbstractTest constructAbstractTest = new CallingAbstractAndNonAbstractMethods();

        abstractTest.test1();
        abstractTest.test2();
        abstractTest.test3();

    }

}
