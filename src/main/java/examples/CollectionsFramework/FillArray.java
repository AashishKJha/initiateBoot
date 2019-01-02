package examples.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class FillArray {
    protected Collection<Character> getArray() {
        char[] name = "aashishkumarjha212121232134234123aashish".toCharArray();
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for (char n : name) {
            arrayList.add(n);
        }
        return arrayList;
    }
}
