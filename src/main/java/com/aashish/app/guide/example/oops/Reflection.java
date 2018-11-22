package com.aashish.app.guide.example.oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflection {
    public static void main(String[] args) {
        DemoReflect d = new DemoReflect();
        Class cls = d.getClass();
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.toString());
        }
        System.out.println(constructors.toString());
        Method[] mt = cls.getMethods();
        for (Method constructor : mt) {
            System.out.println(constructor.getName());
        }

    }
}

class DemoReflect {
    private String name;
    private int num;

    DemoReflect(String name) {
        this.name = name;
    }

    DemoReflect() {
    }

    DemoReflect(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    private int getNum() {
        return num;
    }
}

