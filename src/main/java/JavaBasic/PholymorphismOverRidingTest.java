package JavaBasic;

import org.testng.annotations.Test;

public class PholymorphismOverRidingTest extends PolymorphismOverLoadingTest {

    //@Test
    public void test() {
        test1(10);

    }

    public static void main(String args[]){
        PholymorphismOverRidingTest pholymorphismOverRidingTest = new PholymorphismOverRidingTest();

        pholymorphismOverRidingTest.test1(50);
    }

    public void test1(int a){
        System.out.println("Testing Method overriding === " + a);
    }

    public void test1(String b){
        System.out.println("Test2 === " + b);
    }

}
