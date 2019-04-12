package examples.GFS;

import java.util.*;

public class FancyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        initiator(sc.next());
    }

    private static void initiator(String number) {
        List<Character> arrayList = new ArrayList<>();
        char[] ch = number.toCharArray();

        if (ch.length < 10) {
            System.out.println("Length Should be 10");
        } else {
            for (char c : ch) {
                arrayList.add(c);
            }

            for (int index = 0; index < arrayList.size() - 1; index++) {
                char prev = ' ';
                if (index > 0) {
                    prev = arrayList.get(index - 1);
                }
                char curr = arrayList.get(index);
                char next = arrayList.get(index + 1);
                if (isFourOrMoreTimes(arrayList.get(index), arrayList) || isThreeConsecutive(prev, curr, next) || isThreeIncreasing(prev, curr, next)) {
                    System.out.println("Fancey Number");
                    break;
                }
            }
        }
    }

    private static boolean isThreeConsecutive(char prev, char curr, char next) {
        return (prev == curr) && (curr == next);
    }

    private static boolean isFourOrMoreTimes(char c, List<Character> list) {
        int count = 0;
        for (char cr : list) {
            if (cr == c) {
                count++;
            }
        }
        return count >= 4;
    }

    private static boolean isThreeIncreasing(char prev, char curr, char next) {
        int p = Character.getNumericValue(prev);
        int c = Character.getNumericValue(curr);
        int n = Character.getNumericValue(next);
        return (p + 1 == c) && (c == n - 1);
    }
}
