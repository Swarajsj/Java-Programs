// 1. boolean add(Object o):

import java.util.ArrayList;

public class ArrayList_Method1 {

    public static void main(String[] args) {

        // Integer ArrayList
        ArrayList<Integer> aList = new ArrayList<Integer>();

        aList.add(5);
        aList.add(11);
        aList.add(17);

        System.out.println("Integer Number Added in ArrayList= " + aList);

        // String ArrayList
        ArrayList<String> sList = new ArrayList<String>();

        sList.add("Learning");
        sList.add("JAVA");

        System.out.println("String Added in ArrayList= " + sList);

    }

}