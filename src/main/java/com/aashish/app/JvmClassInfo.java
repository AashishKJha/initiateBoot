package com.aashish.app;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JvmClassInfo {

    public static void main(String[] args) {
        Container cn = new Container();

        Class c = cn.getClass();

        Field[] f = c.getDeclaredFields();

        Method[] m = c.getDeclaredMethods();

        for (Method mt : m) {
            System.out.println(mt.getName());
            System.out.println(mt.getReturnType());
        }

        for (Field fd : f) {
            System.out.println(fd.getName());
        }
    }
}

class Container {
    public int number;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
