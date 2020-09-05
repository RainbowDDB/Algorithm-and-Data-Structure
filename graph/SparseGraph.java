package graph;

import java.util.ArrayList;
import java.util.List;

// 稀疏图————邻接表
public class SparseGraph {
  private int n; // 顶点数
  private int m; // 边数
  // private int[][] g; // 邻接矩阵
  private List<Integer>[] g;
  private boolean directed;

  public SparseGraph(int n, boolean directed) {
    this.n = n;
    this.m = 0;
    this.directed = directed; 
    this.g = new ArrayList[n];
    for (int i = 0; i < n; i++) {
      g[i] = new ArrayList<>();
    }
  }

  public int V() {
    return n;
  }

  public int E() {
    return m;
  }

  public void addEdge(final int v, final int w) {
    assert (v >= 0 && v < n);
    assert (w >= 0 && w < n);

    if (hasEdge(v, w))
      return;

    g[v].add(w);
    // 处理自环边
    if (v != w && !directed) {
      g[w].add(v);
    }
    m++;
  }

  public boolean hasEdge(final int v, final int w) {
    assert (v >= 0 && v < n);
    assert (w >= 0 && w < n);

    return g[v].contains(w);
  }

  // O(E)
  public Iterable<Integer> adj(final int v) {
    assert (v >= 0 && v < n);
    return g[v];
  }
}