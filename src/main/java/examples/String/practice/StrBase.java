package examples.String.practice;

import java.util.*;

public class StrBase {
    protected static String data = "aashishfksagfwiu327529487gfe87324598hkhgrghkehgkjhgjehgjewhg66592865389365892iufgbdjkvsgkjeg89479058374h";

    static void main(String[] args) {
        Set<Character> characterList = new TreeSet<>();
        for (char c : data.toCharArray()) {
            characterList.add(c);
        }
        System.out.println(characterList);
    }
}

class StringOps extends StrBase {
    public static void main(String[] args) {
        char[] cArr = data.toCharArray();
        reverseUsingNewCopy(cArr);
        reverseUsingCollection(cArr);
        reverseUsingStrBuilder(data);
        removeLeadingZero("000000ahdjdj2131212");
    }

    private static void reverseUsingNewCopy(char[] cArr) {
        char[] revArr = new char[cArr.length];
        int length = cArr.length;
        System.out.println(length);
        for (int index = 0; index < length; index++) {
            revArr[index] = cArr[(length - 1) - index];
        }
        System.out.println(revArr);
    }

    private static void reverseUsingCollection(char[] cArr) {
        List<Character> collection = new ArrayList<>();
        for (char c : cArr) {
            collection.add(c);
        }
        Collections.reverse(collection);
        StringBuilder str = new StringBuilder();
        for (char c : collection) {
            str.append(c);
        }
        System.out.println(str);
    }

    private static void reverseUsingStrBuilder(String cArr) {
        StringBuilder stringBuilder = new StringBuilder(cArr);
        System.out.println(stringBuilder.reverse().toString());
    }

    private static void removeLeadingZero(String str) {
        int i = 0;
        while (str.charAt(i) == '0') {
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(0, i, "");
        System.out.println(stringBuilder.toString().trim());
    }


}

