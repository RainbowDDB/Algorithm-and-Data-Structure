package unionfind;

public class UnionQuickFind {
  private int[] id;
  private int count;

  public UnionQuickFind(int n) {
    count = n;
    id = new int[n];
    for (int i = 0; i < n; i++) {
      id[i] = i;
    }
  }

  // O(1)
  public int find(int p) {
    assert (p >= 0 && p < count);
    return id[p];
  }

  public boolean isConnected(int p, int q) {
    return find(p) == find(q);
  }

  // O(n)
  public void union(int p, int q) {
    int pId = find(p);
    int qId = find(q);
    if (pId == qId)
      return;
    for (int i = 0; i < count; i++) {
      if (id[i] == pId) {
        id[i] = qId;
      }
    }
  }
}