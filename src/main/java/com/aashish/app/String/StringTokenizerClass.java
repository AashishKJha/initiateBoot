package com.aashish.app.String;

import java.util.StringTokenizer;

public class StringTokenizerClass extends StringClass {

    public static void main(String[] args) {
        StringTokenizerClass st = new StringTokenizerClass();
        st.printTokens();
    }

    @Override
    public String getString() {
        return super.getString();
    }

    @Override
    public String getChar() {
        return super.getChar();
    }


    public void printTokens() {
        StringTokenizer stn = new StringTokenizer(this.getString(), " ");
        while (stn.hasMoreTokens()) {
            System.out.println(stn.nextToken());
        }
    }
}
