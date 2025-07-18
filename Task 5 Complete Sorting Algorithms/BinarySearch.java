import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Size Of Array:- ");
            int n = sc.nextInt();
            int a[] = new int[n];
            int i;
            System.out.println("Enter " + n + " Elements:- ");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Enter The Element For Search:- ");
            int item = sc.nextInt();

            int beg = 0, end = n - 1;
            int mid = (beg + end) / 2;
            while (item != a[mid] && beg <= end) {
                if (item < a[mid]) {
                    end = mid - 1;
                } else {
                    beg = mid + 1;
                }
                mid = (beg + end) / 2;
            }

            if (beg <= end)
                System.out.println("Element Is Present At Location:- " + mid);
            else
                System.out.println("Element Not Found:- ");
        } 
    }
}