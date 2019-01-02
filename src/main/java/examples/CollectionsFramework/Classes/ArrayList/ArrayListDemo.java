package examples.CollectionsFramework.Classes.ArrayList;

import examples.CollectionsFramework.FillArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo extends FillArray {
    private ArrayListDemo() {
    }

    public static void main(String[] args) {
        ArrayListDemo arrayListDemo = new ArrayListDemo();
        ArrayList<Character> arrayList = new ArrayList<Character>(arrayListDemo.getArray());
        //accessing collection using iterable.

        //        Iterator it = arrayList.iterator();
        //        while (it.hasNext()){
        //            System.out.print(it.next());
        //        }
        System.out.println(arrayList);
        System.out.println("Char at Given Index : " + arrayList.get(10));
    }

    @Override
    protected Collection<Character> getArray() {
        return super.getArray();
    }
}
