package graph;

import java.util.ArrayList;
import java.util.List;

// 稠密图————邻接矩阵
public class DenseGraph {
  private int n; // 顶点数
  private int m; // 边数
  private boolean[][] g; // 邻接矩阵
  private boolean directed;

  public DenseGraph(int n, boolean directed) {
    this.n = n;
    this.m = 0;
    this.directed = directed;
    this.g = new boolean[n][n];
  }

  public int V() {
    return n;
  }

  public int E() {
    return m;
  }

  public void addEdge(int v, int w) {
    assert (v >= 0 && v < n);
    assert (w >= 0 && w < n);

    if (hasEdge(v, w))
      return;

    g[v][w] = true;
    if (!directed) {
      g[w][v] = true;
    }
    m++;
  }

  public boolean hasEdge(int v, int w) {
    assert (v >= 0 && v < n);
    assert (w >= 0 && w < n);

    return g[v][w];
  }

  // O(V^2)
  public Iterable<Integer> adj(int v) {
    assert (v >= 0 && v < n);
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (g[v][i]) {
        list.add(i);
      }
    }
    return list;
  }
}