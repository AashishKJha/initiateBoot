package com.aashish.app.guide.example.oops;

/**
 * Demo for Overrifing with access modifiers.
 */
class OverA {

    protected String tetsVar;

    private void test1() {
        System.out.println("Private Parent Method");
    }

    protected void test2() {
        System.out.println("Protected Parent Method");

    }

    public void test3() {
        System.out.println("Public Parent Method");

    }
}

/**
 * Overriding can be done only on methods not on feild.
 */
public class Overriding extends OverA {
    private void test1() {
        System.out.println("Private Child Method");

    }

    @Override
    public void test2() {
        super.test2();
    }

    @Override
    public void test3() {
        super.test3();
    }

    public static void main(String[] args) {
        Overriding ovr = new Overriding();
        ovr.test1();
        ovr.test2();
        ovr.test3();
    }
}


/**
 * Demo for Overriding with final
 * <p>
 * Final methods cant be overridden
 */

class OverFinal {
    private String str = "Str";

    public String getStr() {
        return this.str;
    }

    final void testData() {
        System.out.println("I m Final Method");
    }
}

class OverridingFinal extends OverFinal {
    @Override
    public String getStr() {
        return super.getStr();
    }

    public static void main(String[] args) {
        OverridingFinal ovf = new OverridingFinal();

        System.out.println(ovf.getStr());
    }
}

/**
 * Overriding static methods
 * <p>
 * Static Method from Parent class can not be overridden.
 * <p>
 * It will be hidden in child class be declare method with same notations in child class.
 */

class OverStatic {
    static int data = 0;

    static void staticMethod() {
        System.out.println("I m static Parent method");
    }

    void normal() {
        System.out.println("Normal from Parent");
    }
}

class OverridingStatic extends OverStatic {

    static void staticMethod() {
        System.out.println("I m static Child method");
    }

    public void normal() {
        System.out.println("Normal From Child");
    }
}

class OverStaticMain {
    public static void main(String[] args) {

        //ovs is object of OverridingStatic class and type of OverStatic class

        //By Overriding rules child static method should override parent static method but not.

        //By Overriding rule child normal method overrides parent normal method.

        OverStatic ovs = new OverridingStatic();

        ovs.staticMethod();

        ovs.normal();
    }
}

class OverrideWithExcepHandlingParent {

}

class OverrideWithExcepHandlingChild {

}