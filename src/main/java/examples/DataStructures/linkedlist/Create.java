package examples.DataStructures.linkedlist;

public class Create {
    Node head;

    public static void main(String[] args) {
        Create create = new Create();
        create.head = new Node(1);
        Node s = new Node(2);
        Node t = new Node(3);
        create.head.next = s;
        s.next = t;
        t.next = null;

        System.out.println("Adding Element 4 to first location");
        create.addElementToFirst(4);
        create.printList();

        System.out.println("\nadding Element 5 to last location");
        create.addElementToLast(5);
        create.printList();

        System.out.println("\nadding Element 9 after 5");
        create.addElementAfterGivenNode(create.head.next, 9);
        create.printList();

        System.out.println("\nremove 9 from List");
        create.removeNodeFromList(create.head.next.next);
        create.printList();

        System.out.println("\nadding Element 6 to last location");
        create.addElementToLast(6);
        create.printList();

        System.out.println("Find elemrnt after 5");
        create.findNodeData(create.head.next.next);

        System.out.println("Reversing List");
        create.reverseList();
    }

    private void addElementToFirst(int data) {
        Node el = new Node(data);
        el.next = head;
        head = el;
    }

    private void addElementToLast(int data) {
        Node el = new Node(data);
        el.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = el;
    }

    private void addElementAfterGivenNode(Node prev, int data) {
        Node new_node = new Node(data);
        if (prev == null) {
            System.out.println("new node can not be null");
            return;
        }
        new_node.next = prev.next;
        prev.next = new_node;
    }

    private void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ---> ");
            n = n.next;
        }
    }

    private void removeNodeFromList(Node n) {
        Node h = head;
        while (h.next != n) {
            h = h.next;
        }
        h.next = n.next;
    }

    private void findNodeData(Node node) {
        int count = 0;
        if (node == null) {
            System.out.println("Node Cant be null");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Node Found at Loc : " + count + " data as : " + temp.data);
    }

    private void reverseList() {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        printList();
    }
}
