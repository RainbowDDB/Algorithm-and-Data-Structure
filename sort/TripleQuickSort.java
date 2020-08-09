package sort;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

class TripleQuickSort {
  private TripleQuickSort() {
  }

  public static void main(String[] args) {
    Comparable[] arr = SortTestHelper.generateRandomArray(20000, 0, 10);
    // TripleQuickSort.sort(arr);
    Comparable[] arr2 = Arrays.copyOf(arr, arr.length);
    Comparable[] arr3 = Arrays.copyOf(arr, arr.length);
    SortTestHelper.testSort("sort.TripleQuickSort", arr);
    // System.out.println(SortTestHelper.isSorted(arr));
    // SortTestHelper.print(arr);
    SortTestHelper.testSort("sort.QuickSort", arr2);
    SortTestHelper.testSort("sort.InsertionSort", arr3);
  }

  public static void sort(Comparable[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  private static void sort(Comparable[] arr, int l, int r) {
    if (r - l <= 15) {
      InsertionSort.sort(arr, l, r);
      return;
    }
    int[] p = partition(arr, l, r);
    sort(arr, l, p[0]);
    sort(arr, p[1], r);
  }

  private static int[] partition(Comparable[] arr, int l, int r) {
    int i = l + 1;
    int lt = l;
    int gt = r + 1;
    Random rand = new Random(new Date().getTime());
    swap(arr, l, rand.nextInt(r - l) + l);
    Comparable v = arr[l];
    while (i < gt) {
      if (arr[i].compareTo(v) < 0) {
        swap(arr, i, lt + 1);
        lt++;
        i++;
      } else if (arr[i].compareTo(v) > 0) {
        swap(arr, i, gt - 1);
        gt--;
      } else {
        i++;
      }
    }
    swap(arr, lt, l);
    return new int[] { lt - 1, gt };
  }

  private static void swap(Comparable[] arr, int i1, int i2) {
    Comparable temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }
}