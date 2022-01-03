package Collections;

import org.testng.annotations.Test;

import java.util.*;

public class ListVsSet {

    @Test
    public void listTest(){
        List stringList = new ArrayList<>();
        List<String> stringList1 = new ArrayList<>();
        String str[] = {"a","b","c","d"};
        int num[] = {1,2,3,4};
        stringList.add("Selenium");
        stringList.add("Appium");
        stringList.add(4.0);
        stringList.add(2.0);
        stringList.add(true);
        stringList.add("Selenium");

        System.out.println("stringList === " + stringList);

        stringList1.add("Protractor");
        stringList1.add("Jenkins");

       // System.out.println("stringList1 === " + stringList1);
    }

    @Test
    public void setTest(){
        Set setArray = new HashSet();
        setArray.add("Selenium");
        setArray.add("Appium");
        setArray.add(4.0);
        setArray.add(2.0);
        setArray.add(true);
        setArray.add("Selenium");

        System.out.println("setArray ====== "  +setArray);
    }

    @Test
    public void mapTest(){
        Map<String, Integer> mapList = new HashMap<>();
        mapList.put("Selenium", 4);
        mapList.put("Appium", 2);
        System.out.println("mapList === "  + mapList);
    }
}
