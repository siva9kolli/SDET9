package Abstrcation;

public class MultipleInheritanceTest implements Interface1, Interface2{


    public void test1() {
        System.out.println("Test1");
    }
    public void test2() {
        System.out.println("Test2");
    }
    public void test3() {
        System.out.println("Test3");
    }
    public void test4() {
        System.out.println("Test4");
    }

    public static void main(String args[]){
        MultipleInheritanceTest multipleInheritanceTest = new MultipleInheritanceTest();
        multipleInheritanceTest.test1();
        multipleInheritanceTest.test2();
        multipleInheritanceTest.test3();
        multipleInheritanceTest.test4();
    }

}
