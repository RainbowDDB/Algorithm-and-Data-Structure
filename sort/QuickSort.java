package sort;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

class QuickSort {
  private QuickSort() {
  }

  public static void main(String[] args) {
    Comparable[] arr = SortTestHelper.generateNearlyOrderedArray(10000, 100);
    Comparable[] arr2 = Arrays.copyOf(arr, arr.length);
    SortTestHelper.testSort("sort.QuickSort", arr);
    SortTestHelper.testSort("sort.MergeSort", arr2);
  }

  public static void sort(Comparable[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  private static void sort(Comparable[] arr, int l, int r) {
    // if (l >= r)
    //   return;
    if (r - l <= 15) {
      InsertionSort.sort(arr, l, r);
      return;
    }

    int p = partition(arr, l, r);
    sort(arr, l, p - 1);
    sort(arr, p + 1, r);
  }

  private static int partition(Comparable[] arr, int l, int r) {
    int j = l;
    // 随机取第一个数，非常重要的优化！
    Random rand = new Random(new Date().getTime());
    swap(arr, l, rand.nextInt(r-l)+l);
    Comparable v = arr[l];
    for (int i = l + 1; i <= r; i++) {
      if (arr[i].compareTo(v) < 0) {
        swap(arr, i, j+1);
        j++;
      }
    }
    swap(arr, l, j);
    return j;
  }

  private static void swap(Comparable[] o, int index1, int index2) {
    Comparable temp = o[index1];
    o[index1] = o[index2];
    o[index2] = temp;
  }
}