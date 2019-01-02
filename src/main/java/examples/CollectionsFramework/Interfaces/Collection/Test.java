package examples.CollectionsFramework.Interfaces.Collection;

import examples.CollectionsFramework.FillArray;

import java.util.Collection;

public class Test extends FillArray {
    public static void main(String[] args) {
        Test test = new Test();
        Collection<Character> collection = test.getArray();
        System.out.println(collection);
        collection.removeIf(d -> d == 'a');
        System.out.println(collection);
    }
}
