package tads.list;

public interface List<T> extends Iterable<T> {
    public void add(T elem);
    public void delete(int pos);
    public T get(int pos);
    public boolean exists(T elem);
}