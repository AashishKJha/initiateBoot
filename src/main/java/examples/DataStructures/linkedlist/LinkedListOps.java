
import java.util.Scanner;

class LinkedList {
    static Node head = null;

    private LinkedList(){
        
    }
    
    private static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Elements To Push to Linked List ");
        Scanner scanner = new Scanner(System.in);
        String userData = scanner.next();
        char[] charArr = userData.toCharArray();
        _append(charArr);
        _printer();
        _addAt(2, 'a');
        _printer();
        System.out.println("index Of a : " + _indexOf('a'));
    }

    private static void _append(char[] charArr) {
        Node temp = null;
        for (int index = 0; index < charArr.length; index++) {
            Node new_node = new Node(charArr[index]);
            if (temp == null) {
                temp = new_node;
                head = temp;
            } else {
                temp.next = new_node;
                temp = new_node;
            }
        }
    }

    private static void _printer() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }
    }

    private static int _getLength() {
        Node temp = head;
        int count = 0;
        System.out.println(temp);
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    private static void _addAt(int index, char ch) {
        Node new_node = new Node(ch);
        Node temp = head;
        Node node = null;
        int count = _getLength();
        System.out.println(count);
        if (index > count) {
            System.out.println("Index Out of bound");
        } else {
            int loc = 0;
            while (loc < index) {
                temp = temp.next;
                loc++;
            }

            node = temp.next;
            temp.next = new_node;
            new_node.next = node;
        }
    }

    private static void _removeAt() {

    }

    private static int _indexOf(char c) {
        Node temp = head;
        int loc = 0;
        boolean found = false;
        while (temp != null) {
            if (temp.data == c) {
                found = true;
                break;
            }
            loc++;
            temp = temp.next;
        }
        if (found) {
            return loc;
        } else {
            return -1;
        }
    }
}
