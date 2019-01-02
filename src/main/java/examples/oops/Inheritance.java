package examples.oops;

public class Inheritance {

    public static void main(String[] args) {

        ChildClass child1 = new ChildClass();

        ChildClass child2 = new ChildClass(10);

        ChildClass child3 = new ChildClass(5, "aashish");
        System.out.println(child1.publicData);

        System.out.println(child2.publicData);

        System.out.println(child3.publicData);

        child1.str = " Ram";

        System.out.println("___Inheritance____");

        System.out.println(child1.retString());

    }
}

class ParentClass {

    /**
     * public instance variable
     */
    public int publicData = 1;

    /**
     * private instance variable
     */
    private int privateData = 2;

    /**
     * protected instance variable
     */
    protected int protectedData = 3;

    /**
     * default modifier instance variable.
     */
    int me = 4;

    protected String str;

    public ParentClass() {

    }

    /**
     * Single parameterized contructor.
     *
     * @param testdata - test data
     */
    public ParentClass(int testdata) {
        this.publicData = testdata;
    }

    /**
     * Multiple parameterized contructor
     *
     * @param testdata - test data type integer
     * @param name     - test name type string
     */
    public ParentClass(int testdata, String name) {

        this.publicData = testdata;

        this.str = name;

    }

    public String retString() {
        return this.str;
    }


}

class ChildClass extends ParentClass {

    public ChildClass() {
        super();
    }

    public ChildClass(int testdata) {
        super(testdata);
    }

    public ChildClass(int testdata, String name) {
        super(testdata, name);
    }

    @Override
    public String retString() {
        return (super.retString() + " " + "Child toString() Method");
    }
}


