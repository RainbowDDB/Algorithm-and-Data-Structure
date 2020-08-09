package sort;

import java.util.Random;

import heap.IndexMapHeap;
import heap.MaxHeap;

class Test {

  public static void main(String[] args) {
    IndexMapHeap<Integer> h = new IndexMapHeap<>(100);
    Random r = new Random();
    for (int i = 0; i < 50; i++) {
      h.insert(i, r.nextInt(100));
    }

    for (int i = 0; i < h.size(); i++) {
      System.out.println(h.extractMaxIndex());
    }
  }
}