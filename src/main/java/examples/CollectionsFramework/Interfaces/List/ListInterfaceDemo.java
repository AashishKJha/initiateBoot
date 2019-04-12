package examples.CollectionsFramework.Interfaces.List;

import java.util.*;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("aashish");
        stringList.add("kumar");
        stringList.add("jha");

        System.out.println(stringList.getFirst());

        for (Object aStringList : stringList) {
//            if(it.hasPrevious()){
//                System.out.print("Prev : " + it.previous());
//            }
            System.out.println("Next : " + aStringList);
        }
    }
}
