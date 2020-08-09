package sort;

import java.util.Arrays;
import java.util.Random;

import heap.MaxHeap;

public class HeapSort {

  public static void sort(Integer[] arr) {
    int n = arr.length;
    MaxHeap<Integer> maxHeap = new MaxHeap<>(n);
    for (int i = 0; i < n; i++) {
      maxHeap.insert(arr[i]);
    }
    for (int i = n - 1; i >= 0; i--) {
      // 从大到小的排序赋值
      arr[i] = maxHeap.extractMax();
    }
  }

  // 优化版 heapify
  public static void sort2(Comparable[] arr) {
    MaxHeap<Comparable> maxHeap = new MaxHeap<>(arr);

    for (int i = arr.length - 1; i >= 0; i--) {
      // 从大到小的排序赋值
      arr[i] = maxHeap.extractMax();
    }
  }

  private static void swap(Comparable[] arr, int i1, int i2) {
    Comparable temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }

  // 用数组存储大顶堆，空间复杂度为O(1)
  public static void heapSort(Comparable<?>[] arr) {

    for (int i = (arr.length - 1) / 2; i >= 0; i--) {
      // 用heapify构建大顶堆
      shiftDown(arr, arr.length, i);
    }

    for (int i = arr.length - 1; i >= 1; i--) {
      swap(arr, 0, i);
      shiftDown(arr, i, 0);
    }
  }

  private static void shiftDown(Comparable[] arr, int n, int i) {
    while (2 * i <= n - 3) {
      int j = 2 * i + 1;
      if (j <= n - 2 && arr[j].compareTo(arr[j + 1]) < 0) {
        j += 1;
      }
      if (arr[j].compareTo(arr[i]) < 0) {
        break;
      }
      swap(arr, i, j);
      i = j;
    }
  }

  public static void main(String[] args) {
    Comparable[] h = new Comparable[100];
    Random r = new Random();
    for (int i = 0; i < 100; i++) {
      h[i] = r.nextInt(100);
    }

    heapSort(h);
    for (int i = 0; i < h.length; i++) {
      System.out.println(h[i]);
    }

    int n = 1000000;
    // 近乎有序数组
    Integer[] arr = SortTestHelper.generateRandomArray(n, 0, n);
    Integer[] arr2 = Arrays.copyOf(arr, arr.length);
    Integer[] arr3 = Arrays.copyOf(arr, arr.length);
    Integer[] arr4 = Arrays.copyOf(arr, arr.length);

    SortTestHelper.testSort("sort.MergeSort", arr);
    SortTestHelper.testSort("sort.QuickSort", arr2);
    SortTestHelper.testSort("sort.TripleQuickSort", arr3);
    SortTestHelper.testSort2("sort.HeapSort", arr4);
    // System.out.println(heap.size());

    // 大量相同元素数组
    Integer[] arr5 = SortTestHelper.generateRandomArray(n, 0, 10);
    Integer[] arr6 = Arrays.copyOf(arr, arr.length);
    Integer[] arr7 = Arrays.copyOf(arr, arr.length);
    Integer[] arr8 = Arrays.copyOf(arr, arr.length);

    SortTestHelper.testSort("sort.MergeSort", arr5);
    SortTestHelper.testSort("sort.QuickSort", arr6);
    SortTestHelper.testSort("sort.TripleQuickSort", arr7);
    SortTestHelper.testSort2("sort.HeapSort", arr8);

    // 接近有序数组
    Integer[] arr9 = SortTestHelper.generateNearlyOrderedArray(n, 10);
    Integer[] arr10 = Arrays.copyOf(arr, arr.length);
    Integer[] arr11 = Arrays.copyOf(arr, arr.length);
    Integer[] arr12 = Arrays.copyOf(arr, arr.length);

    SortTestHelper.testSort("sort.MergeSort", arr9);
    SortTestHelper.testSort("sort.QuickSort", arr10);
    SortTestHelper.testSort("sort.TripleQuickSort", arr11);
    SortTestHelper.testSort2("sort.HeapSort", arr12);
  }
}