package examples.CollectionsFramework.Classes.ArrayList;

import java.util.*;
import java.util.stream.Stream;

public class DeleteDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> names = new ArrayList<>();
        names.add(1);
        names.add(2);
        names.add(3);
        names.add(4);

        Iterator iterator = names.iterator();

//        names.removeIf(d -> names.indexOf(d) != names.lastIndexOf(d));

//        while (iterator.hasNext()){
//            String str = iterator.next().toString();
//            if(names.lastIndexOf(str) != names.indexOf(str)){
//                iterator.remove();
//            }
//        }

        System.out.println("Removed Duplicate data from list");

    }
}
