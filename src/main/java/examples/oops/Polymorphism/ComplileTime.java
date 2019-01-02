package examples.oops.Polymorphism;

/**
 * Polymorphism is greek work poly + morphism. where poly stands for 'many' and morphism means 'forms'.
 * <p>
 * Combined more than one form.
 * <p>
 * A method which can take more than one form supports polymorphism.
 * <p>
 * There are 2 types of Polymorphism:
 * <p>
 * 1>> Compile Time( Method Overloading)
 * <p>
 * 2>> Run Time( Method Overriding)
 * <p>
 * Compile
 */

public class ComplileTime {

    private String name;

    private static double age;

    int Class;

    public String getName() {
        return name;
    }

    public String getName(String name) {
        return name;
    }


    public static double getAge() {
        return age;
    }

    public int getclass() {
        return Class;
    }

    public static void main(String[] args) {
        System.out.println("____Demonstration Of Method Overloading____");

        System.out.println("Calling getName() : ");
    }
}

class ComplileTimeChild {

}


