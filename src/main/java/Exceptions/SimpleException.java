package Exceptions;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class SimpleException {
    public int a;
    public       int b;

    @Test
    public void testException() {
        try {
            a = 5 / 1;
            System.out.println("Try block is executed" + " and a value === " + a);
        } catch (Exception e) {
            // e.printStackTrace();
            a = 6 / 1;
            System.out.println("Catch block is executed " + "and a value is " + a);
        } finally {
            a = 5 / 1;
            System.out.println("Finally Block");
        }
    }

    @Test
    public void exceptionOrder() {
        try {
            int a[] = {1, 2, 4, 4};
      b = a[5];
            int c = 5 / 0;
            System.out.println("Try block is executed");
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException catch block");
            a = 5 / 1;
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("IndexOutOfBoundsException catch block");
            ie.printStackTrace();
        } catch (Exception e) {
            a = 6 / 1;
            System.out.println("Exception Catch block");
        }

    }

    @Test
    public void testMethodLevel() throws InterruptedException {
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }

        Thread.sleep(5000);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
