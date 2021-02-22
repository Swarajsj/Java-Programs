// 2. void add(int index, Object element):

import java.util.ArrayList;
public class ArrayList_Method2 {
    public static void main(String[] args) {

        //Integer ArrayList
        ArrayList<Integer> aList = new ArrayList<Integer>(7);

        aList.add(1);
        aList.add(5);
        aList.add(9);

        // adding element 25 at 3rd position which is index 2
        aList.add(2,25);

        System.out.println("Integer List After 25 added at index 2 = " + aList);

        //String ArrayList

        ArrayList<String> sList = new ArrayList<String>();

        sList.add("JAVA");
        sList.add("At");
        sList.add("AbhiAndroid");

        //Adding Learning String at index 0 i.e. 1st position
        sList.add(0, "Learning");

        System.out.println("String After Learning Added at index 0 = " + sList);

    }

}
