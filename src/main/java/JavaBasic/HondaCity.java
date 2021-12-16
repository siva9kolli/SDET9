package JavaBasic;

public class HondaCity extends Honda {

    public static void main(String args[]){
        HondaCity hondaCity = new HondaCity();
        hondaCity.run();
        System.out.println("Calling Parent Int variables === " + hondaCity.a );
        System.out.println("Calling Parent String variables ===" + hondaCity.name );
    }

    public void subClassHonda(){
        System.out.println("Extra Benefits - Music, Sports looks etc");
    }
}
