package adt.list;

public class LinkedList<T> implements List<T> {
    private class ListNode<T>{
        T elem;
        ListNode<T> next;
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
}
