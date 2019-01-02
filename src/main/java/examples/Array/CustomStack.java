package examples.Array;

import java.util.Scanner;

public class CustomStack {
    int s = 10;

    private int[] stack;
    private Scanner sc = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
        CustomStack cs = new CustomStack();
        cs.fill();
        cs.performAction();
    }


    /**
     *
     */
    private void performAction() {
        int exp = 1, c;
        System.out.println("Press 1 for PUSH");
        System.out.println("Press 2 for POP");
        System.out.println("Press 3 for TOP");
        System.out.println("Press 0 for exit");
        while (exp != 0) {

            System.out.println("Enter Choice : ");
            c = Integer.parseInt(this.getStackIN());
            exp = c;
            switch (exp) {
                case 1:
                    System.out.print("Enter Number : ");
                    this.push(Integer.parseInt(this.getStackIN()));
                    this.disp();
                    break;
                case 2:
                    this.pop();
                    this.disp();
                    break;
                case 3:
                    System.out.println("TOP_INDEX : " + this.getTop());
                    break;
                default:
                    System.out.println("__: Wrong Choice :__");
                    break;
            }
        }
        System.out.println("Exited Succesfully");
    }

    /**
     * @return - int
     */
    private int getTop() {
        int count = 0;
        for (int s : this.stack) {
            System.out.print(s);
            count++;
        }
        return count;
    }


    private String getStackIN() {
        return sc.next();
    }

    private void push(int num) {
        this.add(this.getTop(), num);
    }

    private void pop() {
        if (this.stack.length > 0) {
            System.out.println("Top : " + this.getTop());
            this.delete(this.getTop() - 1);
        }
    }

    private void delete(int ps) {
        int[] new_Arr = new int[this.stack.length - 1];

        for (int p = 0; p < ps; p++) {
            new_Arr[p] = this.stack[p];
        }

        for (int i = new_Arr.length - 1; i >= ps; i--) {
            new_Arr[i] = this.stack[i + 1];
        }

        this.stack = new_Arr;
    }

    private void add(int ps, int num) {
        int[] new_Arr = new int[this.stack.length + 1];

        for (int m = 0; m < ps; m++) {
            new_Arr[m] = this.stack[m];
        }

        new_Arr[ps] = num;

        for (int i = new_Arr.length - 1; i > ps; i--) {
            new_Arr[i] = this.stack[i - 1];
        }

        this.stack = new_Arr;
    }

    private int getVal(int pos) {
        return this.stack[pos];
    }

    private void disp() {
        System.out.print("Output : ");
        for (int s : this.stack) {
            System.out.print(s);
        }
        System.out.print("\n");
    }

    private void fill() {
        this.stack = new int[0];
    }
}
