package examples.Array;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<Integer>();
    }
}

class UserTypeArr {
    public int data;
    public String name;


}

class Main {
    public static void main(String[] args) {
        UserTypeArr usr = new UserTypeArr();
        ArrayList<UserTypeArr> testAr = new ArrayList<>();

        usr.data = 12;
        usr.name = "initiateBoot";

        for (int i = 0; i < 5; i++) {
            testAr.add(usr);
        }

        for (int i = 0; i < testAr.size(); i++) {
            System.out.println(testAr.get(i).data + " " + testAr.get(i).name);
        }
    }
}
