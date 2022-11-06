package basic_data_structures.pointers;

import java.util.Arrays;
import java.util.Collections;

public class LinkedList {

    // LinkedList Basic Operations
    // Insert, Remove, Search, Print
    public static void main(String[] args) {
        // Java Collections
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        linkedList.add(1);
        linkedList.remove();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        System.out.println(linkedList.peek()); // 20
        linkedList.add(55);
        linkedList.addAll(Arrays.asList(10, 20, 30));
        System.out.println(linkedList);

        // Basic LinkedList Structure
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        Node curr = head.next;
        while (curr != null) {
            System.out.printf("%d ", curr.value);
            curr = curr.next;
        }
    }
}

class Node {
    Node next;
    int value;
    Node(int v) {
        value = v;
    }
}
