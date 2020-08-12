package tree;

public class BinarySearch {
  // 必须为有序数组,从小到大
  public static int binarySearch(int[] arr, int target) {
    int l = 0, r = arr.length - 1;
    while (l <= r) {
      // int mid = (l + r) / 2; bug版本(int值溢出问题)
      int mid = l + (r - l) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    return -1;
  }
}