package examples.GFS.array_logics;

public class VProblem {
    public static void main(String[] args) {
        String data = "12345678";
        formate(data);
    }

    private static void formate(String arr) {
        char[] chars = arr.toCharArray();
        int len = chars.length;
        if (len % 2 == 0) {
            for (int i = 0, j = len - 1; i <= len / 2 && j >= len / 2; i++, j--) {
                System.out.print(chars[i]);
                System.out.print(chars[j]);
            }
        } else {
            for (int i = 0, j = len - 1; i < len / 2 && j > len / 2; i++, j--) {
                System.out.print(chars[i]);
                System.out.print(chars[j]);
            }
            System.out.print(chars[len / 2]);
        }
    }

}
