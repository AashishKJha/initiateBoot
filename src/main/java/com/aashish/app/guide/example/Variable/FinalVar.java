package com.aashish.app.guide.example.Variable;

/**
 * Final Cant asign multiple times.
 * <p>
 * But we can create multiple object of class and then assign value.
 */
public class FinalVar {
    public final int DATA = 20;

    private final int D;

    private FinalVar(int d) {
        this.D = d;
    }

    private FinalVar() {
        this(10);
    }

    public static void main(String[] args) {
        FinalVar f = new FinalVar(12);
        System.out.println(f.D);
    }
}

