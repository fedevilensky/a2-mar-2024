package tads.priorityqueue;

public interface PriorityQueue<E, P extends Comparable<P>> {
  public void push(E element, P priority);

  public E pop();

  public E top();

  public boolean isEmpty();

  public int size();
}
