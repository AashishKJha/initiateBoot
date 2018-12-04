package com.aashish.app.guide.example.oops;

/**
 *
 */

public class Abstraction extends AbstractDemo {

    private Abstraction(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String process(String sur_name) {
        return this.getName() + sur_name;
    }

    public static void main(String[] args) {
        Abstraction as = new Abstraction("Aashish");
        //as.setName("Aashish");
        System.out.println(as.process(" Jha"));
    }
}

abstract class AbstractDemo {
    private String name;

    abstract public String process(String name);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    AbstractDemo() {

    }

    AbstractDemo(String name) {
        this.name = name;
    }

}
