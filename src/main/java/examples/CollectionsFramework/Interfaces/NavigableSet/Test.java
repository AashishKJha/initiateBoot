package examples.CollectionsFramework.Interfaces.NavigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        NavigableSet<String> navigableSet = new TreeSet<>();
        for (int p = 0; p < 10; p++) {
            navigableSet.add(String.valueOf(p));
        }
        System.out.println(navigableSet.toString());
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet.pollLast());
        System.out.println(navigableSet.last());

    }
}
