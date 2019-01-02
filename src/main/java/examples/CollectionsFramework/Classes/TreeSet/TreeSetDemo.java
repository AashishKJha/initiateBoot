package examples.CollectionsFramework.Classes.TreeSet;

import examples.CollectionsFramework.FillArray;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeSet;

/**
 * Demonstrating TreeSetDemo Class Of Collection Framework.
 */
public class TreeSetDemo extends FillArray {
    public static void main(String[] args) {
        TreeSetDemo treeSetDemo = new TreeSetDemo();
        TreeSet<Character> treeSet = new TreeSet<>(treeSetDemo.getArray());
        System.out.println("_____________Complete TreeSet Value___________");
        System.out.println(treeSet);
        System.out.println("_____________Methods___________");
        System.out.println(treeSet.descendingSet());
        System.out.println(Arrays.toString(treeSet.toArray()).charAt(10));

        treeSet.descendingSet();
    }

    @Override
    protected Collection<Character> getArray() {
        return super.getArray();
    }
}
