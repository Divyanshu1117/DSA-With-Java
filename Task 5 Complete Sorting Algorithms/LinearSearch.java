import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Size Of Array:- ");
            int n = sc.nextInt();
            int a[] = new int[n];
            int i, status = 0;
            System.out.println("Enter " + n + " Elements:- ");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Enter The Element For Search:- ");
            int item = sc.nextInt();

            for (i = 0; i < n; i++) {
                if (item == a[i]) {
                    System.out.println("Element Is Present At Location:- " + i);
                    status = 1;
                    break;
                }
            }
            if (status == 0)
                System.out.println("Element Not Found:-");
        }
    }
}