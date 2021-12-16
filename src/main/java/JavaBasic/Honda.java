package JavaBasic;

public class Honda extends Car{

    public static void main(String args[]){
        Honda honda = new Honda();
        honda.run();
        System.out.println("Calling Parent Int variables === " + honda.a );
        System.out.println("Calling Parent String variables ===" + honda.name );
        honda.benefits();
    }

    public void benefits(){
        System.out.println("Petrol or diesel etc");
        System.out.println("Honda Logo");
    }
}
