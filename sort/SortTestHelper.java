package sort;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Random;

class SortTestHelper {

  // private final Student s = new Student("g", 1);

  private SortTestHelper() {
    // s = new Student("h", 2);
  }

  public static void main(String[] args){
    
  }
  
  public static Integer[] generateRandomArray(int n, int rangeL, int rangeR) {
    assert rangeL <= rangeR;
    

    Integer[] arr = new Integer[n];
    Random rand = new Random(new Date().getTime());
    for (int i = 0; i < n; i++) {
      arr[i] = rand.nextInt(rangeR - rangeL) + rangeL;
    }
    return arr;
  }

  public static Integer[] generateNearlyOrderedArray(int n, int swapTimes) {
    Integer[] arr = new Integer[n];
    for (int i = 0; i < n; i++) {
      arr[i] = i;
    }
    Random rand = new Random(new Date().getTime());
    for (int i = 0; i < swapTimes; i++) {
      int x = rand.nextInt(n);
      int y = rand.nextInt(n);
      swap(arr, x, y);
    }
    return arr;
  }

  public static void print(Comparable<?>[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  // 判断arr数组是否有序
  public static boolean isSorted(Comparable[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i].compareTo(arr[i + 1]) > 0) {
        return false;
      }
    }
    return true;
  }

  public static void testSort(String sortClassName, Comparable<?>[] arr) {
    try {
      // 通过sortClassName获得排序函数的Class对象
      Class sortClass = Class.forName(sortClassName);
      // 通过排序函数的Class对象获得排序方法
      Method sortMethod = sortClass.getMethod("sort", new Class[] { Comparable[].class });
      // 排序参数只有一个，是可比较数组arr
      Object[] params = new Object[] { arr };

      long startTime = System.currentTimeMillis();
      // 调用排序函数
      sortMethod.invoke(null, params);
      long endTime = System.currentTimeMillis();

      assert isSorted(arr);

      System.out.println(sortClass.getSimpleName() + " : " + (endTime - startTime) + "ms");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void testSort2(String sortClassName, Comparable[] arr) {
    try {
      // 通过sortClassName获得排序函数的Class对象
      Class sortClass = Class.forName(sortClassName);
      // 通过排序函数的Class对象获得排序方法
      Method sortMethod = sortClass.getMethod("sort2", new Class[] { Comparable[].class });
      // 排序参数只有一个，是可比较数组arr
      Object[] params = new Object[] { arr };

      long startTime = System.currentTimeMillis();
      // 调用排序函数
      sortMethod.invoke(null, params);
      long endTime = System.currentTimeMillis();

      assert isSorted(arr);

      System.out.println(sortClass.getSimpleName() + " : " + (endTime - startTime) + "ms");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void swap(Comparable[] o, int index1, int index2) {
    Comparable temp = o[index1];
    o[index1] = o[index2];
    o[index2] = temp;
  }
}