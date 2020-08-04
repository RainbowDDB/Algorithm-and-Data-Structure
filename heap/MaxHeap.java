package heap;

class MaxHeap<Item extends Comparable> {

  private Item[] data;
  private int count;
  private int capacity;

  public MaxHeap(int capacity) {
    data = (Item[]) new Comparable[capacity + 1];
    count = 0;
    this.capacity = capacity;
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

  private void shiftUp(int k) {
    while (k > 1 && data[k / 2].compareTo(data[k]) < 0) {
      swap(k, k / 2);
      k /= 2;
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
      maxHeap.insert((int) Math.random() * i);
    }

    System.out.println(maxHeap.size());

  }
}