public class Queue {
  int SIZE = 4;
  int queue[] = new int[SIZE];
  int front, rear;

  Queue() {
    front = -1;
    rear = -1;
  }

  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  void enQueue(int item) {
    if (isFull()) {
      System.out.println("Queue Is Full:- ");
    } else {
      if (front == -1) {
        front = 0;
      }
      rear++;
      queue[rear] = item;
      System.out.println("Element " + item + " Inserted Successfully:- ");
    }
  }

  int deQueue() {
    int item;
    if (isEmpty()) {
      System.out.println("Queue Is Empty:- ");
      return (-1);
    } else {
      item = queue[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      } else {
        front++;
      }
      System.out.println("Element " + item + " Deleted Sucessfully:- ");
      return (item);
    }
  }

  int peek() {
    int item;
    if (isEmpty()) {
      System.out.println("Queue Is Empty:- ");
      return (-1);
    } else {
      item = queue[front];
      System.out.println("Element " + item + " Deleted Sucessfully:- ");
      return (item);
    }
  }

  void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue:- ");
    } else {
      System.out.println("Queue Contents:- ");
      for (i = front; i <= rear; i++)
        System.out.print(queue[i] + " ");
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.enQueue(10);
    q.enQueue(20);
    q.enQueue(30);
    q.display();
    q.deQueue();
    q.display();
    System.out.println("Peek Value Is:- " + q.peek());
  }
}