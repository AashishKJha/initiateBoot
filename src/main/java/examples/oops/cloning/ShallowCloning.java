package examples.oops.cloning;

public class ShallowCloning implements Cloneable {
    private String data1;
    private String data2;
    private String data3;

    private ShallowCloning(String data1, String data2, String data3t) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3t;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCloning shallowCloning = new ShallowCloning("data1", "data2", "data3");

        ShallowCloning shallowCloning1 = (ShallowCloning) shallowCloning.clone();

        System.out.println(shallowCloning1.toString());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "{data1 : " + this.data1 + ", data2 : " + this.data2 + ", data3 : " + this.data3 + "}";
    }
}
