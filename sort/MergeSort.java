package sort;

import java.util.Arrays;

class MergeSort {
  private MergeSort() {
  }

  public static void main(String[] args) {
    Comparable[] arr = SortTestHelper.generateNearlyOrderedArray(100000, 0);
    Comparable[] arr2 = Arrays.copyOf(arr, arr.length);
    // MergeSort.sort(arr);
    SortTestHelper.testSort("sort.MergeSort", arr);
    SortTestHelper.testSort("sort.InsertionSort", arr2);
  }

  public static void sort(Comparable[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  // 递归使用归并排序，对arr[l...r]排序
  private static void sort(Comparable[] arr, int l, int r) {
    // if (l >= r)
    // return; //选用插入排序进行进一步优化
    if (r - l <= 15) {
      InsertionSort.sort(arr, l, r);
      return;
    }
    int mid = (l + r) / 2;
    sort(arr, l, mid);
    sort(arr, mid + 1, r);
    // 对近乎顺序的排序进行极大的优化！
    if (arr[mid].compareTo(arr[mid + 1]) > 0) {
      merge(arr, l, mid, r);
    }
  }

  // 使用自底而上的方式
  public static void sortBU(Comparable[] arr) {
    int len = arr.length;
    for (int sz = 1; sz <= len; sz += sz) {
      for (int i = 0; i + sz < len; i += sz + sz) {
        merge(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, len - 1));
      }
    }
  }

  private static void merge(Comparable[] arr, int l, int mid, int r) {
    int len = r - l + 1;
    Comparable[] temp = new Comparable[len];
    for (int i = 0; i < len; i++) {
      temp[i] = arr[l + i];
    }
    int i = l;
    int j = mid + 1;
    for (int k = l; k <= r; k++) {
      if (i > mid) {
        // [mid+1..r]没有归并完
        arr[k] = temp[j - l];
        j++;
      } else if (j > r) {
        // [l,mid]没有归并完
        arr[k] = temp[i - l];
        i++;
      } else if (temp[i - l].compareTo(temp[j - l]) > 0) {
        arr[k] = temp[j - l];
        j++;
      } else {
        arr[k] = temp[i - l];
        i++;
      }
    }
  }
}