// Stack Implementation Using Linked List:-
class Node {
    public int data;
    public Node next;

    public Node(int item) {
        data = item;

    }
}

public class StackDynamic {
    public Node head;

    public StackDynamic() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(int item) {
        Node newnode = new Node(item);
        newnode.next = head;
        head = newnode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Is Empty...:- ");
            return 0;
        } else {
            int item = head.data;
            head = head.next;
            return item;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Is Empty...:- ");
            return 0;
        } else {
            int item = head.data;
            return item;
        }
    }

    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        StackDynamic stack = new StackDynamic();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack Items:- ");
        stack.display();

        System.out.println(stack.pop() + " Is POPED From Stack...:- ");
        System.out.println("Stack Items:- ");
        stack.display();
        System.out.println("Peek Value Is:- " + stack.peek());

    }
}