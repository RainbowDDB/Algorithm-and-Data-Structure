package unionfind;

public class UnionFind {
  private int[] parent;
  private int[] sz; // 以sz[i]为根的集合中元素的个数
  private int[] rank; // 以rank[i]为根的树的层数
  private int count;

  public UnionFind(int n) {
    count = n;
    parent = new int[n];
    for (int i = 0; i < n; i++) {
      parent[i] = i;
      sz[i] = 1;
      rank[i] = 1;
    }
  }

  // // 找到p对应的根节点
  // public int find(int p) {
  //   assert (p >= 0 && p < count);
  //   while (parent[p] != p) {
  //     // 优化3：路径压缩的优化
  //     parent[p] = parent[parent[p]];
  //     p = parent[p];
  //   }
  //   return p;
  // }

  // 找到p对应的根节点
  public int find(int p) {
    assert (p >= 0 && p < count);
    if (parent[p] != p) {
      // 优化3：新思路，路径压缩的优化
      parent[p] = find(parent[p]);
    }
    return parent[p];
  }

  public boolean isConnected(int p, int q) {
    return find(p) == find(q);
  }

  // public void union(int p, int q) {
  //   int pRoot = find(p);
  //   int qRoot = find(q);
  //   if (pRoot == qRoot)
  //     return;
  //   // 优化1：基于size的优化，使得树的高度尽可能小
  //   if (sz[pRoot] < sz[qRoot]) {
  //     parent[pRoot] = qRoot;
  //     sz[qRoot] += sz[pRoot];
  //   } else {
  //     parent[qRoot] = pRoot;
  //     sz[pRoot] += sz[qRoot];
  //   }
  // }

  public void union(int p, int q) {
    int pRoot = find(p);
    int qRoot = find(q);
    if (pRoot == qRoot)
      return;
    // 优化2：基于层数rank的优化，克服极限情况
    if (rank[pRoot] < rank[qRoot]) {
      parent[pRoot] = qRoot;
    } else if(rank[pRoot] > rank[qRoot]){
      parent[qRoot] = pRoot;
    } else {
      parent[pRoot] = qRoot;
      rank[qRoot]++;
    }
  }
}