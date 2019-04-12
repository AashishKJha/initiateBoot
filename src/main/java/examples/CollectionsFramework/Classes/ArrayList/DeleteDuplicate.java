package examples.CollectionsFramework.Classes.ArrayList;

import java.util.*;
import java.util.stream.Stream;

public class DeleteDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> names = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "ashish");
        map.put("age", 10);
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            System.out.println(next.getKey() + " ======= " + next.getValue());
        }

//        names.add(1);
//        names.add(2);
//        names.add(3);
//        names.add(4);
//
//        Iterator iterator = names.iterator();



//        while (iterator.hasNext()){
//            String str = iterator.next().toString();
//            System.out.println(str);
////            if(names.lastIndexOf(str) != names.indexOf(str)){
//                iterator.remove();
//
////            }
//        }
//
//        System.out.println(names);
//
//        System.out.println("Removed Duplicate data from list");

    }
}
