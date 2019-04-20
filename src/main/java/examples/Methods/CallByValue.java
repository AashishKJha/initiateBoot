package examples.Methods;

/**
 * Call By Value Approach.
 */
public class CallByValue {
    static String s1;
    static String s2;

    public static void main(String[] args) {
        s1 = "aashish";
        s2 = "jha";
        System.out.println(manipulate(s1, s2));

        System.out.println(s1);
    }

    private static String manipulate(String s1, String s2) {
        s1 = s1 + s2;
        return s1;
    }
}
