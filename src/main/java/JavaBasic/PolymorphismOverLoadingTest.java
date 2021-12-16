package JavaBasic;

public class PolymorphismOverLoadingTest {
    /**
     * Method OverLoading
     * @param a
     */
    public void test1(int a){
        System.out.println("Test1 === " + a);
    }

    public void test1(String b){
        System.out.println("Test2 === " + b);
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public double sum(int a, double b){
        return a+b;
    }

    public void withDrawal(double a){

    }

    public void withDrawal(int a){

    }

    public void createUser(String name, int id){

    }

    public void createUser(String name, int id, int phone){

    }
}
