package sort;

class SelectionSort {
  private SelectionSort() {
  }

  public static void main(String[] args) {
    Integer[] arr = SortTestHelper.generateRandomArray(10000, 0, 10000);
    SortTestHelper.testSort("sort.SelectionSort", arr);
    Integer[] arr2 = SortTestHelper.generateRandomArray(100000, 0, 100000);
    SortTestHelper.testSort("sort.SelectionSort", arr2);

    // SortTestHelper.print(arr);

    // Float[] arr2 = { 1.1f, 2.2f, 4.4f, 3.3f };
    // SelectionSort.sort(arr2);
    // for (int i = 0; i < arr2.length; i++) {
    // System.out.println(arr2[i]);
    // }

    // Student[] arr3 = new Student[3];
    // arr3[0] = new Student("Rainbow", 21);
    // arr3[1] = new Student("cc", 20);
    // arr3[2] = new Student("dd", 20);
    // SelectionSort.sort(arr3);
    // for (int i = 0; i < arr3.length; i++) {
    // System.out.println(arr3[i]);
    // }
  }

  public static void sort(Comparable[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      // 找到剩余未排序的最小值，赋给第i位置
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minIndex].compareTo(arr[j]) > 0) {
          minIndex = j;
        }
      }
      swap(arr, minIndex, i);
    }
  }

  private static void swap(Comparable[] o, int index1, int index2) {
    Comparable temp = o[index1];
    o[index1] = o[index2];
    o[index2] = temp;
  }
}