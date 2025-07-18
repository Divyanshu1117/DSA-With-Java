import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Size Of Array:- ");
            int n = sc.nextInt();
            int a[] = new int[n];
            int i, k, temp, ptr;
            System.out.println("Enter " + n + " Elements:- ");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (k = 1; k < n; k++) {
                temp = a[k];
                ptr = k - 1;
                while (ptr >= 0 && temp < a[ptr]) {
                    a[ptr + 1] = a[ptr];
                    ptr = ptr - 1;
                }
                a[ptr + 1] = temp;
            }

            System.out.println("Sorted List:- ");
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}