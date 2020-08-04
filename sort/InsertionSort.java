package sort;

import java.util.Arrays;

class InsertionSort {
  private InsertionSort() {
  }

  public static void main(String[] args) {
    Integer[] arr = SortTestHelper.generateRandomArray(100, 0, 200);
    InsertionSort.sort(arr, 0, arr.length-1);
    SortTestHelper.print(arr);

    // Integer[] arr = { 2, 3, 6, 8, 1, 5 };
    // SortTestHelper.testSort("sort.InsertionSort", arr);
    // Integer[] arr = SortTestHelper.generateNearlyOrderedArray(10000, 5);
    Integer[] arr2 = Arrays.copyOf(arr, arr.length);
    Integer[] arr3 = Arrays.copyOf(arr, arr.length);
    SortTestHelper.testSort("sort.InsertionSort", arr);
    SortTestHelper.testSort2("sort.InsertionSort", arr2);
    SortTestHelper.testSort("sort.SelectionSort", arr3);
    // InsertionSort.sort(arr);
    // SortTestHelper.print(arr);
  }

  // public static void sort(Comparable[] arr) {
  // int length = arr.length;
  // for (int i = 1; i < length; i++) {
  // // 找到arr[i]的正确位置，插入
  // for (int j = i; j > 0; j--) {
  // if (arr[j].compareTo(arr[j - 1]) < 0) {
  // swap(arr, j, j - 1);
  // } else {
  // // 什么都不用做，因为之前已插入的是按顺序的了
  // break;
  // }
  // }
  // }
  // }

  // 优化版重载[l..r]
  public static void sort(Comparable[] arr,int l,int r) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    //   Comparable e = arr[i];
    //   int j = i;
    //   for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--)
    //     arr[j] = arr[j - 1];
    //   arr[j] = e;
    // }

    int length = arr.length;
    for (int i = l+1; i < r+1; i++) {
      Comparable temp = arr[i];
      int j;
      // 找到arr[i]的正确位置
      for (j = i; j > l; j--) {
        if (temp.compareTo(arr[j - 1]) < 0) {
          // temp = arr[j];
          // 不交换，减少中间次数
          arr[j] = arr[j - 1];
        } else {
          break;
        }
      }
      arr[j] = temp;
    }
  }

  // 优化版
  public static void sort(Comparable[] arr) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // Comparable e = arr[i];
    // int j = i;
    // for (; j > 0 && arr[j - 1].compareTo(e) > 0; j--)
    // arr[j] = arr[j - 1];
    // arr[j] = e;
    // }

    int length = arr.length;
    for (int i = 1; i < length; i++) {
      Comparable temp = arr[i];
      int j;
      // 找到arr[i]的正确位置
      for (j = i; j > 0; j--) {
        if (temp.compareTo(arr[j - 1]) < 0) {
          // temp = arr[j];
          // 不交换，减少中间次数
          arr[j] = arr[j - 1];
        } else {
          break;
        }
      }
      arr[j] = temp;
    }
  }

  // 优化版
  public static void sort2(Comparable[] arr) {
    int length = arr.length;
    for (int i = 1; i < length; i++) {
      Comparable temp = arr[i];
      int j;
      // 找到arr[i]的正确位置
      for (j = i; j > 0 && temp.compareTo(arr[j - 1]) < 0; j--) {
        // if (temp.compareTo(arr[j - 1]) < 0) {
        // temp = arr[j];
        // 不交换，减少中间次数
        arr[j] = arr[j - 1];
        // } else {
        // break;
        // }
      }
      arr[j] = temp;
    }
  }

  private static void swap(Comparable[] o, int index1, int index2) {
    Comparable temp = o[index1];
    o[index1] = o[index2];
    o[index2] = temp;
  }
}