package tree;

import java.util.LinkedList;
import java.util.Queue;

// BST
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
  private class Node {
    Key key;
    Value value;
    Node left;
    Node right;

    Node(Key key, Value value) {
      this.key = key;
      this.value = value;
      this.right = this.left = null;
    }
  }

  private Node root;
  private int count;

  public BinarySearchTree() {
    root = null;
    count = 0;
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public void insert(Key k, Value v) {
    root = insert(root, k, v);
  }

  public Value search(Key k) {
    Node n = search(root, k);
    if (n == null)
      return null;
    return n.value;
  }

  public boolean contain(Key k) {
    return search(root, k) != null;
  }

  public void preOrder() {
    preOrder(root);
  }

  public void inOrder() {
    inOrder(root);
  }

  public void postOrder() {
    postOrder(root);
  }

  public void levelOrder() {
    levelOrder(root);
  }

  public Key minimum() {
    assert count != 0;
    return minimum(root).key;
  }

  public Key maximum() {
    assert count != 0;
    return maximum(root).key;
  }

  public void removeMin() {
    if (root == null)
      return;

    root = removeMin(root);
  }

  public void removeMax() {
    if (root == null)
      return;

    root = removeMax(root);
  }

  private Node removeMax(Node node) {
    if (node.right == null) {
      Node leftNode = node.left;
      count--;
      return leftNode;
    }
    node.right = removeMax(node.right);
    return node;
  }

  private Node removeMin(Node node) {
    if (node.left == null) {
      Node rightNode = node.right;
      count--;
      return rightNode;
    }
    node.left = removeMin(node.left);
    return node;
  }

  private Node minimum(Node node) {
    if (node.left == null) {
      return node;
    }
    return minimum(node.left);
  }

  private Node maximum(Node node) {
    if (node.right == null) {
      return node;
    }
    return maximum(node.right);
  }

  private void preOrder(Node node) {
    if (node == null)
      return;

    System.out.print(node.key + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  private void inOrder(Node node) {
    if (node == null)
      return;

    inOrder(node.left);
    System.out.print(node.key + " ");
    inOrder(node.right);
  }

  private void postOrder(Node node) {
    if (node == null)
      return;

    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.key + " ");
  }

  private void levelOrder(Node node) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      Node n = queue.poll();
      System.out.println(n.key);
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
  }

  private Node insert(Node node, Key k, Value v) {
    if (node == null) {
      count++;
      return new Node(k, v);
    }
    if (k.compareTo(node.key) == 0) {
      node.value = v;
    } else if (k.compareTo(node.key) < 0) {
      node.left = insert(node.left, k, v);
    } else {
      node.right = insert(node.right, k, v);
    }
    return node;
  }

  private Node search(Node node, Key k) {
    if (node == null) {
      return null;
    }
    if (k.compareTo(node.key) == 0) {
      return node;
    } else if (k.compareTo(node.key) > 0) {
      return search(node.right, k);
    } else {
      return search(node.left, k);
    }
  }

}