package com.aashish.app.guide.example;

import java.util.Scanner;

public class Basic {
    /**
     * Global Variables
     */
    static int staticInt;

    int data;

    /**
     * Enum declatation.
     */
    enum Color {
        RED, GREEN, BLUE;
    }

    enum TrafficSignal {
        // This will call enum constructor with one
        // String argument
        RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

        // declaring private variable for getting values
        private String action;

        // getter method
        public String getAction() {
            return this.action;
        }

        // enum constructor - cannot be public or protected
        private TrafficSignal(String action) {
            this.action = action;
        }
    }

    public void Idebtifires() {
        System.out.println("_______Method consists basic of Identifires ______");
        System.out.println("Java Idebtifies are case sensetive.");
    }

    public void dataTypes() {
        boolean boolData = false;
        short s = 56;
        int intData = 2;
        char charData = 'a';
        float floatData = 2;
        double doubleData = 2;
        System.out.println("Boolean Data : " + boolData);
        System.out.println("Char Data : " + charData);
        System.out.println("Int Data : " + intData);
        System.out.println("Float Data : " + floatData);
        System.out.println("Double Data : " + doubleData);
        System.out.println("short: " + s);
    }

    public void enumTut() {


        /**
         *
         * Enumerations serve the purpose of representing a group of named constants
         *
         *
         * ____values(), ordinal() and valueOf() methods______
         *
         * These methods are present inside java.lang.Enum.
         *
         * Using valueOf() ---> we can get the enum constant of specific value
         *
         * Using values() ---> we can get all enum constant in the form of array.
         *
         * Using ordinal() ---> we can get index of specific enum constant.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Favourate Color For Testing Enums In Java : ");

        String userColor = input.next();

        System.out.println(Color.valueOf(userColor));

        Color[] arr = Color.values();

        for (Color col : arr) {
            System.out.println(col + " at index "
                    + col.ordinal());
        }
    }

    public void enumWithCustomizeValues() {

        TrafficSignal[] signals = TrafficSignal.values();

        for (TrafficSignal signal : signals) {
            // use getter method to get the value
            System.out.println("name : " + signal.name() +
                    " action: " + signal.getAction());
        }
    }

    public void variables() {

        /**
         * Local Variable of method
         */

        int localVar = 3;

        Variables var = new Variables();

        var.data = 3;

        /**
         * We can not access static member of class by their instance.
         */

        /**
         * We can access static member by using class name.
         */

        Variables.staticData = 3;

        System.out.println(Variables.staticData);

        Variables.staticData = 5;

        System.out.println(Variables.staticData);

        System.out.println(Variables.staticData + 1);

    }


}

class Variables {

    /**
     * static variables
     */

    static int staticData;

    int data;
}


