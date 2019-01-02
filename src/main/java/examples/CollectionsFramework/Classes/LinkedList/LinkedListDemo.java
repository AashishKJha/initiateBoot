package examples.CollectionsFramework.Classes.LinkedList;

import examples.CollectionsFramework.FillArray;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo extends FillArray {
    public static void main(String[] args) {
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        LinkedList<Character> linkedList = new LinkedList<>(linkedListDemo.getArray());
        System.out.println("_______Complete Linked List_______");
        System.out.println(linkedList);
        System.out.println("_______Get First Of Linked List_______");
        System.out.println(linkedList.getFirst());
        System.out.println("_______Get Last Of Linked List_______");
        System.out.println(linkedList.getLast());
        System.out.println("_______Peek First Of Linked List");
        System.out.println(linkedList.peekFirst());
        System.out.println("_______Peek Last Of Linked List");
        System.out.println(linkedList.peekLast());
    }

    @Override
    protected Collection<Character> getArray() {
        return super.getArray();
    }
}
