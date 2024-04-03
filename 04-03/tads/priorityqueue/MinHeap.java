package tads.priorityqueue;

public class MinHeap<E, P extends Comparable<P>> implements PriorityQueue<E, P> {
  private Object[] heap;
  private int heapSize;

  class Pair<E, P> {
    E fst;
    P snd;

    Pair(E fst, P snd) {
      this.fst = fst;
      this.snd = snd;
    }
  }

  @Override
  public void push(E element, P priority) {
    heapSize++;
    if (heap.length <= heapSize) {
      Object[] newHeap = new Object[heap.length * 2];
      for (int i = 1; i < heap.length; i++) {
        newHeap[i] = heap[i];
      }
      heap = newHeap;
    }

    Pair<E, P> pair = new Pair<E, P>(element, priority);
    heap[heapSize] = pair;

    siftUp(heapSize);
  }

  public void siftUp(int pos) {
    int parentPos = pos / 2;
    if (parentPos < 1) {
      return;
    }

    Pair<E, P> parent = (Pair<E, P>) heap[parentPos];
    Pair<E, P> node = (Pair<E, P>) heap[pos];

    if (parentIsGreater(node.snd, parent.snd)) {
      swap(pos, parentPos);
      siftUp(parentPos);
    }
  }

  private void swap(int a, int b) {
    Object aux = heap[a];
    heap[a] = heap[b];
    heap[b] = aux;
  }

  private boolean parentIsGreater(P child, P parent) {
    return parent.compareTo(child) > 0;
  }

  @Override
  public E pop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pop'");
  }

  @Override
  public E top() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'top'");
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

}
