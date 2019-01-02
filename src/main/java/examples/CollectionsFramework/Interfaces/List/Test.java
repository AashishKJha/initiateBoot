package examples.CollectionsFramework.Interfaces.List;

import java.util.ArrayList;
import java.util.List;

/**
 * Making Test Class Generic
 *
 * @param <T> - type
 */
public class Test<T> {
    List<T> list = new ArrayList<T>();

    public static void main(String[] args) {
        Test<Object> test = new Test<>();
        System.out.println(test.getList("test"));
    }

    private List<T> getList(T data) {
        this.list.add(data);
        return this.list;
    }
}
