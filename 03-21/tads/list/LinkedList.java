package tads.list;
import java.util.Iterator;

public class LinkedList<T> implements List<T> {
    private class ListNode<T>{
        T elem;
        ListNode<T> next;
    }

    private class ListIterator<U> implements Iterator<U>{
        ListNode<U> curr;

        ListIterator(ListNode root){
            curr = root;
        }

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public U next() {
            U currElem = curr.elem;
            curr = curr.next;
            return currElem;
        }

    }

    private ListNode<T> root;

    @Override
    public void add(T elem){
        ListNode<T> newNode = new ListNode<>();
        newNode.elem = elem;
        newNode.next = root;
        root = newNode;
    }

    @Override
    public void delete(int pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public T get(int pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public boolean exists(T elem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this.root);
    }
}