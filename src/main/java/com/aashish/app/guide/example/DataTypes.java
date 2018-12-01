package com.aashish.app.guide.example;

/**
 * _____________________________________________
 * Java is strongly & statically typed language.
 * _____________________________________________
 * <p>
 * _____________________________________________
 * Java has basically 2 types of data
 * <p>
 * 1. Primitive
 * <p>
 * 2. Object or Non-primitive
 * ______________________________________________
 * There are 8 types of primitive data.
 * <p>
 * 1. boolean - true or false 1 bit
 * 2. byte - 8 bit
 * 3. char - 2 byte 16 bit.
 * 4. int - 4 byte 32 bit
 * 5. short - 2 byte 16 bit.
 * 6. float - 4 byte 32 bit
 * 7. double - 8 byte 64 bit
 * 8. long - 8 byte 64 bit
 * _____________________________________________
 * <p>
 * _____________________________________________
 * <p>
 * By default fractional value is double in java
 * _____________________________________________
 */

public class DataTypes {
    int numi = 0;
    float numf = 0.31231313321212312313f;
    double numd = 0.31231313321212312313d;

    //if dealing with memory use byte & short

    byte b = 0;
    short s = 0;
    boolean bl = false;
    char c = 'a';
    long l = 1000000000;

    public static void main(String[] args) {

        DataTypes d = new DataTypes();

        System.out.println(d.numi);

        System.out.println(d.numf);

        System.out.println(d.numd);

        System.out.println(d.l);
        System.out.println(d.b);
        System.out.println(d.s);
        System.out.println(d.bl);
        System.out.println(d.c);
    }
}
