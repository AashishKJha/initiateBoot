package examples.oops.exceptionhandling;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class Basic extends RuntimeException {
    private int b = 1;
    private int a = 0;

    private int devide() {
        return b / a;
    }

    public static void main(String[] args) {
        Basic bs = new Basic();
        if (bs.a == 0) {
            throw new IllegalArgumentException("Devide By zero");
        } else {
            System.out.println(bs.devide());
        }

        System.out.println(bs.getException(bs));
    }

    @ExceptionHandler(Basic.class)
    public String getException(Basic be) {
        return be.getLocalizedMessage();
    }


}
