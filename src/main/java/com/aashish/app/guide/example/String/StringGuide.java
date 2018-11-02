package com.aashish.app.guide.example.String;


import java.util.*;

public class StringGuide extends StringClass {

    public static void main(String[] args) {
        StringGuide stg = new StringGuide();
        String str = stg.getString();
        String c = stg.getChar();
        int index = stg.findIndex(str, c);
        //System.out.println(stg.getLastIndex(str, c));
        System.out.println(index == -1 ? "Not Found" : "Found at " + (index + 1));

    }
}

class StringClass {
    private Scanner input = new Scanner(System.in);


    public String getString() {
        System.out.print("Enter Valid String to process java string methods >> ");
        return this.input.nextLine();
    }

    public String getChar() {
        System.out.print("Enter char >> ");
        return this.input.next();
    }

    /**
     * Method is used to get length of particular string.
     *
     * @param str - inpur string
     * @return - return data.
     */
    public int length(String str) {
        return str.length();
    }

    public char charAt(String str, int index) {
        return str.charAt(index);
    }

    public String substring(String str, int start, int end) {
        return str.substring(start, end);
    }

    public String concat(String str1, String str2) {
        return str1.concat(str2);
    }

    /**
     * Method is used to get index of char or string in string.
     *
     * @param str   - input string
     * @param input - input character
     * @param i     - index optional
     * @return - integer.
     */
    public int findIndex(String str, String input, Integer... i) {
        if (i.length == 0) {
            return str.indexOf(input);
        } else {
            return str.indexOf(input, i[0]);
        }
    }

    public int getLastIndex(String str, String input) {
        return str.lastIndexOf(input) + 1;
    }

}
