package examples.Debugging;

import java.util.ArrayList;
import java.util.List;

public class TestDebuggning {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(new Student(i, "", i + 10));
        }

        System.out.println(list);
    }
}
