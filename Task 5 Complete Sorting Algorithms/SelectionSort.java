import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Size Of Array:- ");
            int n = sc.nextInt();
            int a[] = new int[n];
            int i, j, min, loc, temp;
            System.out.println("Enter " + n + " Elements:- ");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (i = 0; i < n; i++) {
                min = a[i];
                loc = i;
                for (j = i + 1; j < n; j++) {
                    if (min > a[j]) {
                        min = a[j];
                        loc = j;
                    }
                }
                temp = a[i];
                a[i] = a[loc];
                a[loc] = temp;
            }

            System.out.println("Sorted List:- ");
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}