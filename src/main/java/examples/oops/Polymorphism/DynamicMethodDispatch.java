package examples.oops.Polymorphism;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        /**
         * Run time polymorphism
         */
        B a = new C();
        a.setName("aashish");
        C c = new C();
        c.setName("Kumar");
        System.out.println(a.mergerName(" Jha"));
        System.out.println(c.mergerName(" Jha"));
    }
}

class A {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class B extends A {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String mergerName(String surName) {
        return this.getName() + surName;
    }
}

class C extends B {
    @Override
    public String mergerName(String surName) {
        return super.mergerName(surName);
    }
}

