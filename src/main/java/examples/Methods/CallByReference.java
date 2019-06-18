package examples.Methods;

public class CallByReference {
    private String s1;
    private String s2;

    private CallByReference(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public static void main(String[] args) {
        CallByReference call = new CallByReference("initiateBoot", "jha");
        System.out.println(call.manupulate(call));

        System.out.println(call.s1);
    }

    private String manupulate(CallByReference callByReference) {
        callByReference.s1 = callByReference.s1 + callByReference.s2;
        return callByReference.s1;
    }
}
