package JavaBasic;

public class FirstClass {

    public static void main(String args[]){
        FirstClass firstClass = new FirstClass();
        firstClass.addition();
        firstClass.sub();
        int x = firstClass.sum();
        int y = firstClass.subtraction();
        testingMain();
    }

    public static void testingMain(){
        System.out.println("Test call from main");
    }

    public void addition(){
        int a = 10;
        int b = 20;
        int c;
        c = a + b;
        System.out.println("c value  === "  + c);
    }

    public void sub(){
        int a = 20;
        int b = 10;
        int c;
        c = a - b;
        System.out.println("c value  === "  + c);
    }

    public int sum(){
        int a = 10;
        int b = 20;
        int c;
        c = a + b;
        System.out.println("c value  === "  + c);
        return c;
    }

    public int subtraction(){
        int a = 20;
        int b = 10;
        int c;
        c = a - b;
        System.out.println("c value  === "  + c);
        return c;
    }
}
