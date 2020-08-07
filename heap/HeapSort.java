package heap;

public class HeapSort {
  public static void main(String[] args) {
    int n = 20;
    MaxHeap<Integer> heap = new MaxHeap<>(2 * n + 1);
    for (int i = 0; i < 2 * n + 1; i++) {
      heap.insert((int) (Math.random() * i));
    }

    for (int i = 0; i < heap.size(); i++) {
      System.out.println(heap.extractMax());
    }
    // System.out.println(heap.size());
  }
}