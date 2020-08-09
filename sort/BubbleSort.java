package sort;

class BubbleSort {
  private BubbleSort() {
  }

  public static void main(String[] args) {
    Integer[] arr = { 1, 2, 3, 4, 5, 8, 6 };
    BubbleSort.sort(arr);
    SortTestHelper.print(arr);
  }

  public static void sort(Comparable[] arr) {
    int length = arr.length;
    // 优化：加一个判断交换与否的布尔值
    boolean swapped = false;
    for (int i = 1; i < length; i++) {
      swapped = false;
      for (int j = 0; j < length - i; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          swap(arr, j, j + 1);
          swapped = true;
        }
      }
      // System.out.println("time="+i);
      if (!swapped) {
        break;
      }
      // SortTestHelper.print(arr);
    }
  }

  private static void swap(Comparable<?>[] o, int index1, int index2) {
    Comparable<?> temp = o[index1];
    o[index1] = o[index2];
    o[index2] = temp;
  }
}