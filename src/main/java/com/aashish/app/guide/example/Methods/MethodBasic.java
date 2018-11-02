package com.aashish.app.guide.example.Methods;

public class MethodBasic {
    private int number;

    /**
     * Contructor
     *
     * @param number -  number passed as int
     */
    MethodBasic(int number) {
        this.number = number;
    }

    /**
     * Method is used to get number.
     *
     * @return - number return.
     */
    public int getNumber() {
        return this.number;
    }

    public static void main(String[] args) {
        MethodBasic mb = new MethodBasic(132323);
        System.out.println("Your Number : " + mb.getNumber());
    }
}
