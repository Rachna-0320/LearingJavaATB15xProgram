package ex_20_Collection_Framework_SET;

import java.util.*;

public class Lab0173_HashSet {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("waterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.size());
    }
}
