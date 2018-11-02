package com.aashish.app.guide.example;

public class Reverse {
    public void reverse(String dataForReverse) {
        StringBuilder data = new StringBuilder(dataForReverse);

        /**
         * Reverse of string
         */
        data.reverse();

        System.out.println("Reverse Output of Given String as: ");
        System.out.println(data);
    }
}
