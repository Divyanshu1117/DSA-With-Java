// Queue Implementation Using Linked List:-
class Node {
    int data;
    Node next;

    Node(int item) {
        this.data = item;
        this.next = null;
    }
}

class QueueDynamic {
    Node front, rear;

    QueueDynamic() {
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null && rear == null;
    }

    void enqueue(int item) {
        Node newnode = new Node(item);
        if (rear == null) {
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow:- ");
            return;
        }
        // Node temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue Is Empty:- ");
        }
        return front.data;
    }

    void display() {
        System.out.println("Queue Elements:- ");
        Node ptr = front;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDynamic q = new QueueDynamic();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();

        System.out.println("Queue Front:- " + q.peek());
    }
}