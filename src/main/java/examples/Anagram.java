package examples;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Anagram ang = new Anagram();
        System.out.print("Enter String 1 : ");

        String str1 = input.nextLine();

        System.out.print("Enter String 2 : ");

        String str2 = input.nextLine();

        if (ang.anagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }

    }

    public boolean anagram(String input1, String input2) {
        /**
         * Test Case 1
         */

        if (input1.length() != input2.length()) {
            return false;
        } else {
            /**
             * Test case 2
             */
            ArrayList<Character> data1 = this.converter(input1);

            ArrayList<Character> data2 = this.converter(input2);

            for (int i = 0; i < data1.size(); i++) {
                if (data1.get(i) != data2.get(i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public ArrayList<Character> converter(String str) {
        char[] ch1 = str.toCharArray();
        ArrayList<Character> chr1 = new ArrayList<Character>();

        for (char data : ch1) {
            chr1.add(data);
        }

        Collections.sort(chr1);

        return chr1;
    }
}
