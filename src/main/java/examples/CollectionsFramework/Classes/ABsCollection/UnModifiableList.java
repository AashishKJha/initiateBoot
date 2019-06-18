package examples.CollectionsFramework.Classes.ABsCollection;

import java.util.*;

public class UnModifiableList<T> {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("initiateBoot");
        stringList.add("kumar");
        stringList.add("jha");
        stringList.add(10, "Aasjosj Kumar");
        System.out.println(stringList);

    }
}

