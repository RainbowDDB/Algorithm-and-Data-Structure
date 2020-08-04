package sort;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

class DoubleQuickSort {
  private DoubleQuickSort() {
  }

  public static void main(String[] args) {
    Comparable[] arr = SortTestHelper.generateRandomArray(20000, 0, 10);
    Comparable[] arr2 = Arrays.copyOf(arr, arr.length);
    Comparable[] arr3 = Arrays.copyOf(arr, arr.length);
    SortTestHelper.testSort("sort.DoubleQuickSort", arr);
    SortTestHelper.testSort("sort.QuickSort", arr2);
    SortTestHelper.testSort("sort.InsertionSort", arr3);
    // DoubleQuickSort.sort(arr);
    // System.out.println(SortTestHelper.isSorted(arr));
    // SortTestHelper.print(arr);
  }

  public static void sort(Comparable[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  private static void sort(Comparable[] arr, int l, int r) {
    if (l >= r)
      return;
    int p = partition(arr, l, r);
    sort(arr, l, p - 1);
    sort(arr, p + 1, r);
  }

  private static int partition(Comparable[] arr, int l, int r) {
    int i = l + 1;
    int j = r;
    Random rand = new Random(new Date().getTime());
    swap(arr, l, rand.nextInt(r - l) + l);
    Comparable temp = arr[l];
    while (i <= j) {
      if (arr[i].compareTo(temp) < 0) {
        i++;
      } else if (arr[j].compareTo(temp) > 0) {
        j--;
      } else {
        swap(arr, i, j);
        i++;
        j--;
      }
      // while (i <= r && arr[i].compareTo(temp) < 0) {
      // i++;
      // }
      // while (j >= i + 1 && arr[j].compareTo(temp) > 0) {
      // j--;
      // }
      // if (i > j) {
      // break;
      // }
      // swap(arr, i, j);
      // i++;
      // j--;
    }
    swap(arr, l, j);
    return j;
  }

  private static void swap(Comparable[] arr, int i1, int i2) {
    Comparable temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }
}