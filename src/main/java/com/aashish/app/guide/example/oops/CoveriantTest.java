package com.aashish.app.guide.example.oops;

class Father {

    Father(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return this.name;
    }
}

class Son extends Father {

    Son(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}


public class CoveriantTest {
    public static void main(String[] args) {
        Son son = new Son(Constants.INVALID);
        System.out.println(son.getName());
    }
}
