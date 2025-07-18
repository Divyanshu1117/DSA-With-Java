import java.util.Arrays;
class Quicksort 
{
  static int partition(int a[], int low, int high) 
  {
    int pivot = a[high];
    int i = (low - 1);
      for (int j = low; j < high; j++) 
      {
      if (a[j] <= pivot) 
      {
        i++;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }

    int temp = a[i + 1];
    a[i + 1] = a[high];
    a[high] = temp;

    return (i + 1);
  }

  static void quickSort(int a[], int low, int high) 
  {
    if (low < high) 
    {
      int pos = partition(a, low, high);
      quickSort(a, low, pos - 1);
      quickSort(a, pos + 1, high);
    }
  }

  public static void main(String args[]) 
  {
    int x[] = { 8, 7, 2, 1, 0, 9, 6 };
    System.out.println("Unsorted Array:- ");
    System.out.println(Arrays.toString(x));

    int size = x.length;
    quickSort(x, 0, size - 1);

    System.out.println("Sorted Array In Ascending Order:- ");
    System.out.println(Arrays.toString(x));
  }
}