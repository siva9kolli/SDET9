package OOPS;

public class AbsTestExecution extends AbsImplementation{

    public static void main(String args[]){
        //AbsTestExecution absTestExecution = new AbsTestExecution();
        AbsTest absTestExecution = new AbsTestExecution();

        absTestExecution.addition();
        absTestExecution.multiplication();
        absTestExecution.division();
        absTestExecution.test1();
    }

}
