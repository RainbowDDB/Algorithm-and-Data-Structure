package heap;

public class MaxHeap<Item extends Comparable> {

  private Item[] data;
  private int count;
  private int capacity;

  // 大顶堆
  public MaxHeap(int capacity) {
    data = (Item[]) new Comparable[capacity + 1];
    count = 0;
    this.capacity = capacity;
  }

  // heapify方式优化
  public MaxHeap(Item[] arr) {
    this.capacity = arr.length;
    data = (Item[]) new Comparable[capacity + 1];
    for (int i = 0; i < arr.length; i++) {
      data[i + 1] = arr[i];
    }
    count = arr.length;
    for (int i = count / 2; i >= 1; i--) {
      shiftDown(i);
    }
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public int size() {
    return count;
  }

  public void insert(Item item) {
    assert (count + 1 <= capacity);
    count++;
    data[count] = item;
    shiftUp(count);
  }

  // 取出最顶元素
  public Item extractMax() {
    assert (count < 1);
    Item i = data[1];

    swap(1, count);
    count--;
    // 调整位置
    shiftDown(1);
    return i;
  }

  // 向上调整
  private void shiftUp(int k) {
    while (k > 1 && data[k / 2].compareTo(data[k]) < 0) {
      swap(k, k / 2);
      k /= 2;
    }
  }

  private void shiftDown(int k) {
    while (k * 2 <= count) {
      int i = 2 * k;
      // 超过count的时候直接跳过第一个判断，防止误判
      if (i + 1 <= count && data[i + 1].compareTo(data[i]) > 0) {
        i += 1;
      }
      if (data[i].compareTo(data[k]) <= 0) {
        break;
      }
      swap(i, k);
      k = i;
    }
  }

  private void swap(int i1, int i2) {
    Item temp = data[i1];
    data[i1] = data[i2];
    data[i2] = temp;
  }

  public static void main(String[] args) {
    MaxHeap<Integer> maxHeap = new MaxHeap<>(100);
    for (int i = 0; i < 15; i++) {
      maxHeap.insert(i);
    }

    for (int i = 0; i < maxHeap.size(); i++) {
      System.out.print(maxHeap.extractMax() + " ");
    }
  }
}