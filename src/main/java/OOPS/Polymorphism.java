package OOPS;

public class Polymorphism {

    public void addition(int a, int b){
        int c;
        c = a+ b;
        System.out.println("c value === " + c);
    }

    public void addition(int a, int b, int d){
        int c;
        c = a+ b;
        System.out.println("c value === " + c);
    }

    public void addition(int a, double b){
        double c;
        c = a+ b;
        System.out.println("c value === " + c);
    }

    public int sum(int a, int b){
        System.out.println("a+b == " + (a+b));
        return a+b;
    }

    public double sum(double a, int b){
        System.out.println("a+b == " + (a+b));
        return a+b;
    }
}
