package examples.CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class BasicCollection {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        List<String> li = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            str.add(String.valueOf(i));
        }
        str.forEach(data -> {
            System.out.println(data);
        });
    }
}
