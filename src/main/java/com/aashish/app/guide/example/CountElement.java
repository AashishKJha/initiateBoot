package com.aashish.app.guide.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CountElement {
    public void countNumber(String data) {
        CountElement countElementcons = new CountElement();
        ArrayList<Character> arr = new ArrayList<Character>(countElementcons.collector(data));
        char[] Ident;

        char myChar = arr.get(0);
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != myChar) {
                if (myChar == ' ') {
                    System.out.print("Space" + ": ");
                    System.out.println(count);
                } else {
                    System.out.print(myChar + ": ");
                    System.out.println(count);
                }
                myChar = arr.get(i);
                count = 0;
            }
            count++;
        }
        if (myChar == ' ') {
            System.out.print("Space" + ": ");
            System.out.println(count);
        } else {
            System.out.print(myChar + ": ");
            System.out.println(count);
        }
    }

    public Collection<Character> collector(String data) {
        ArrayList<Character> charList = new ArrayList<Character>();
        char[] charArray = data.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charList.add(charArray[i]);
        }
        Collections.sort(charList);
        return charList;
    }
}
