package collectionrel;

import java.util.*;

public class S04 {

    public static void main(String[] args) {

        String[] things = {"eggs", "lasers", "hats", "pie" };
        List<String> list1 = new ArrayList<>();

        //add array items to list
        Collections.addAll(list1, things);

        String[] morethings = {"lasers", "hats" };
        List<String> list2 = new ArrayList<>();

        //add array items to list
        list2.addAll(Arrays.asList(morethings));

        for (String aList1 : list1) {
            System.out.printf("%s ", aList1);
        }
    }
}