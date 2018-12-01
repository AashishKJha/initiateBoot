package com.aashish.app.guide.example.Enum;

/**
 * ____________________________________________________________________________________________________
 * Enumerations serve the purpose of representing a group of named constants in a programming language.
 * ____________________________________________________________________________________________________
 * ________________________________________________________________
 * Enums are used when we know all possible values at compile time.
 * ________________________________________________________________
 * <p>
 * ______________________________________________
 * Java enums are more powerful than C/C++ enums.
 * ______________________________________________
 * <p>
 * __________________________________________________________________
 * In Java, we can also add variables, methods and constructors to it
 * __________________________________________________________________
 * <p>
 * _____________________________________________________________
 * First line inside enum should be list of constants
 * and then other things like methods, variables and constructor
 * _____________________________________________________________
 * <p>
 * ________________________________________________________________
 * According to Java naming conventions.
 * it is recommended that we name constant with all capital letters.
 * ________________________________________________________________
 * <p>
 * ______________________________________________________
 * Every enum constant represents an object of type enum.
 * ______________________________________________________
 * <p>
 * ___________________________________________________________
 * enum type can be passed as an argument to switch statement.
 * ___________________________________________________________
 * <p>
 * _____________________________________________________________
 * Every enum constant is always implicitly public static final.
 * <p>
 * Since it is static, we can access it by using enum Name.
 * <p>
 * Since it is final, we can’t create child enums.
 * _____________________________________________________________
 * <p>
 * _____________________________________________________________
 * <p>
 * values() method can be used to return all values present inside enum.
 * <p>
 * ordinal() method, each enum constant index can be found, just like array index.
 * <p>
 * valueOf() method returns the enum constant of the specified string value, if exists.
 * ____________________________________________________________________
 */

public class EnumTest {

    String type;

    enum Color {
        //name constants.
        RED, PINK, YELLOW("dark");

        //variable declaration in enum

        //no-args contructor
        Color() {
        }

        //argumented constructor
        Color(String type) {
            System.out.println("countructor with type : " + type);
            EnumTest e = new EnumTest();
            e.type = type;
        }
    }

    public static void main(String[] args) {
        System.out.println(Color.YELLOW);
    }
}

enum Color {
    RED("Danger"), WHITE("PEACE"), BLACK("UNHAPPY"), ORANGE("HAPPY"), PINK;

    //var inside enum
    private String category;

    //multiple constructor inside enum.
    Color() {
    }

    Color(String cat) {
        this.category = cat;
    }

    //method inside enum
    public String getCategory() {
        return this.category;
    }
}

class CustomizeEnum {
    public static void main(String[] args) {
        Color[] cat = Color.values();
        for (Color c : cat) {
            System.out.println(c.name());
            System.out.println(c.getCategory());
        }
    }
}



