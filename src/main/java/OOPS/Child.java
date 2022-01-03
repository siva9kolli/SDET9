package OOPS;

public class Child extends Parent  {

    public static void main(String args[]){
        Child child = new Child();
        //Parent parent = new Parent();

        child.addition();
       // parent.addition();
        System.out.println("integer variable  " + child.a);
        System.out.println("String variable  " + child.s);
    }

    public void addition(){
        System.out.println("Testing Child Class");
    }
}

