package part2;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "A", "B", "C", "D", "A", "A", "B"));

        Set<String> set = new HashSet<>(list);

        System.out.println(set);


        System.out.println("-----------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1,1,1,2,2,2,3,3,4,5,6,7,1,2,3,4));

        System.out.println(set2);
        //System.out.println(set2.get(0));

        /*
        for (Integer each : set2) {
            System.out.println(each);
        }

         */

        List<Integer> list2 = new ArrayList<>(set2);

        System.out.println(list2.get(1));

        System.out.println("-----------------------------------------");

        Integer[] arr = list2.toArray(new Integer[list2.size()]);

        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");

        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

    /*
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i) < 4){
                l.remove(i);
            }
        }
*/

        /*
        Iterator<Integer> iterator = l.iterator();

        while(iterator.hasNext()){
            Integer each = iterator.next();
            if(each < 4){
                iterator.remove();
            }
        }
*/

        l.removeIf( e -> e < 4 );

        System.out.println(l);



    }


}
