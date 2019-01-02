package examples.String;

import java.util.StringJoiner;

public class StringJoinerClass extends StringClass {

    public static void main(String[] args) {
        StringJoinerClass stj = new StringJoinerClass();

        StringJoiner sj = new StringJoiner(",");

        while (sj.length() < 30) {
            sj.add(stj.getString());
        }

        System.out.println(sj.toString());

    }

    @Override
    public String getString() {
        return super.getString();
    }
}

