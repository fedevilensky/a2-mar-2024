package adts.bst;

public class AVL<T extends Comparable<T>> implements BST<T> {
  class AVLNode<T> {
    T data;
    AVLNode<T> left = null;
    AVLNode<T> right = null;
    int height = 1;

    AVLNode(T data) {
      this.data = data;
    }
  }

  private AVLNode<T> root = null;
  private int elements = 0;

  private int nodeHeight(AVLNode<T> node) {
    if (node == null) {
      return 0;
    } else {
      return node.height;
    }
  }

  private int balanceFactor(AVLNode<T> node) {
    return nodeHeight(node.left) - nodeHeight(node.right);
  }

  private int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  private AVLNode<T> insertNode(AVLNode<T> node, T data) {
    if (node == null) {
      this.elements++;
      return new AVLNode<T>(data);
    }
    // else
    if (node.data == data) {
      return node;
    }
    // else
    if (data.compareTo(node.data) > 0) {
      node.right = insertNode(node.right, data);
    } else {
      node.left = insertNode(node.left, data);
    }

    node.height = 1 + max(nodeHeight(node.left), nodeHeight(node.right));

    int bF = balanceFactor(node);
    if (bF > 1) {
      // desbalanceado a la izq-?
      int bfLeft = balanceFactor(node.left);
      if (bfLeft > 0) {
        return rightRotation(node);
      } else if (bfLeft < 0) {
        return leftRightRotation(node);
      }
    }
    if (bF < -1) {
      int bfRight = balanceFactor(node.right);
      if (bfRight > 0) {
        return leftRotation(node);
      } else if (bfRight < 0) {
        return rightLeftRotation(node);
      }
    }

    return node;
  }

  private AVLNode<T> rightLeftRotation(AVLNode<T> node) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'rightLeftRotation'");
  }

  private AVLNode<T> leftRightRotation(AVLNode<T> node) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'leftRightRotation'");
  }

  private AVLNode<T> rightRotation(AVLNode<T> node) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'rightRotation'");
  }

  private AVLNode<T> leftRotation(AVLNode<T> node) {
    /*
     * z y
     * / \ / \
     * a y => z x
     * / \ / \
     * b x a b
     */

    AVLNode<T> z = node;
    AVLNode<T> y = node.right;

    z.right = y.left;
    y.left = z;

    z.height = 1 + max(nodeHeight(z.left), nodeHeight(z.right));
    y.height = 1 + max(nodeHeight(y.left), nodeHeight(y.right));

    return y;
  }

  @Override
  public void insert(T data) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insert'");
  }

  @Override
  public void remove(T data) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean contains(T data) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public int height() {
    return this.nodeHeight(this.root);
  }

  @Override
  public int size() {
    return this.elements;
  }

}
