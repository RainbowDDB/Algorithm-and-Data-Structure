package heap;

public class IndexMapHeap<Item extends Comparable> {

  private Item[] data;
  private int[] indexes;
  private int count;
  private int capacity;

  // 大顶堆
  public IndexMapHeap(int capacity) {
    data = (Item[]) new Comparable[capacity + 1];
    indexes = new int[capacity + 1];
    count = 0;
    this.capacity = capacity;
  }

  // heapify方式优化
  public IndexMapHeap(Item[] arr) {
    this.capacity = arr.length;
    data = (Item[]) new Comparable[capacity + 1];
    indexes = new int[capacity + 1];
    for (int i = 0; i < arr.length; i++) {
      data[i + 1] = arr[i];
      indexes[i + 1] = i + 1;
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

  // 对于用户而言是从0开始索引的
  public void insert(int i, Item item) {
    assert (count + 1 <= capacity);
    assert (i + 1 >= 1 && i + 1 <= capacity);
    count++;
    data[i + 1] = item;
    indexes[count] = i + 1;
    shiftUp(count);
  }

  // 取出最顶元素
  public Item extractMax() {
    if (count == 0)
      return null;
    Item i = data[indexes[1]];

    swap(1, count);
    count--;
    // 调整位置
    shiftDown(1);
    return i;
  }

  // 取出最顶元素索引
  public int extractMaxIndex() {
    assert (count < 1);
    int i = indexes[1];

    swap(1, count);
    count--;
    // 调整位置
    shiftDown(1);
    return i;
  }

  // 向上调整
  private void shiftUp(int k) {
    while (k > 1 && data[indexes[k / 2]].compareTo(data[indexes[k]]) < 0) {
      swap(k, k / 2);
      k /= 2;
    }
  }

  private void shiftDown(int k) {
    while (k * 2 <= count) {
      int i = 2 * k;
      // 超过count的时候直接跳过第一个判断，防止误判
      if (i + 1 <= count && data[indexes[i + 1]].compareTo(data[indexes[i]]) > 0) {
        i += 1;
      }
      if (data[indexes[i]].compareTo(data[indexes[k]]) <= 0) {
        break;
      }
      swap(i, k);
      k = i;
    }
  }

  private void swap(int i1, int i2) {
    int temp = indexes[i1];
    indexes[i1] = indexes[i2];
    indexes[i2] = temp;
  }
}