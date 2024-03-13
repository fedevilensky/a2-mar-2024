package adts.bst;

interface BST<T extends Comparable<T>> {
  void insert(T data);

  void remove(T data);

  boolean contains(T data);

  int height();

  int size();
}
