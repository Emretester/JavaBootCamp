package part2;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> p1 = new HashMap<>();
        p1.put("name", "James");
        p1.put("gender", 'M');
        p1.put("age", 29);


        Map<String, Object> p2 = new HashMap<>();
        p2.put("name", "Yulia");
        p2.put("gender", 'F');
        p2.put("age", 32);


        Map<String, Object> p3 = new HashMap<>();
        p3.put("name", "Breanna");
        p3.put("gender", 'F');
        p3.put("age", 39);


        List<Map<String, Object>> list = new ArrayList<>();
        list.addAll(Arrays.asList(p1, p2, p3));

        for (Map<String, Object> eachMap : list) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
            System.out.println("-----------------------");
        }

        System.out.println("-----------------------------------------------");

        System.out.println(  list.get(1).get("name") );


    }

}
