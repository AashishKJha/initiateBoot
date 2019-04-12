package examples.CollectionsFramework.Classes.ABsCollection;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class AbsCollection {

    public static void main(String[] args) {
        AbstractCollection<String> abstractCollection = new ArrayList<>();
        abstractCollection.add("aashish");
        abstractCollection.add("aashish");
        abstractCollection.add("aashish");
        abstractCollection.add("aashish");
        abstractCollection.add("aashish");
        abstractCollection.add("aashish");
        ((ArrayList<String>) abstractCollection).remove(3);

        System.out.println(abstractCollection);

    }
}
