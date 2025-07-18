class Stack {
  private int a[];
  private int top;
  private int capacity;

  Stack(int size) {
    a = new int[size];
    capacity = size;
    top = -1;
  }

  public void push(int item) {
    if (isFull()) {
      System.out.println("Stack OverFlow:- ");
      System.exit(1);
    }
    a[++top] = item;
    System.out.println("Element " + item + " Inserted Successfully:- ");
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("STACK IS EMPTY:- ");
      System.exit(1);
    }
    return a[top--];
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("STACK IS EMPTY:- ");
      System.exit(1);
    }
    return a[top];
  }

  public int getSize() {
    return top + 1;
  }

  public Boolean isEmpty() {
    return top == -1;
  }

  public Boolean isFull() {
    return top == capacity - 1;
  }

  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.print(a[i] + " ");
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.print("Stack Contents:- ");
    stack.printStack();
    stack.pop();
    System.out.print("\nAfter POP Stack Contents:-  ");
    stack.printStack();
    System.out.println();
    System.out.println("Peek Value Is:- " + stack.peek());
  }
}