class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    void traverse() {
        Node ptr = head;
        System.out.println("Linked List Is As Follows:- ");
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    boolean search(int item) {
        Node ptr = head;
        while (ptr != null) {
            if (ptr.data == item) {
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Position Out Of Range:- ");
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    void deleteFromBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    void deleteFromEnd() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    void deleteFromPosition(int position) {
        if (head == null) {
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Position Out Of Range:- ");
            }
            current = current.next;
        }
        if (current.next == null) {
            throw new IndexOutOfBoundsException("Position Out Of Range:- ");
        }
        current.next = current.next.next;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);

        ll.traverse();

        ll.insertAtBeginning(5);
        ll.traverse();

        ll.insertAtPosition(25, 2);
        ll.traverse();

        boolean result = ll.search(90);
        if (result == true)
            System.out.println("Element 90 Is Present In The Linked List:- ");
        else
            System.out.println("Element 90 Is Not Present In The Linked List:- ");

        ll.deleteFromBeginning();
        ll.traverse();

        ll.deleteFromEnd();
        ll.traverse();

        ll.deleteFromPosition(1);
        ll.traverse();
    }
}