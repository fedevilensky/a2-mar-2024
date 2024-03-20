package tads.map;

public interface Map<K, V> extends Iterable<Pair<K, V>> {
  public boolean has(K key);

  public V get(K key);

  public void set(K key, V value);

  public void delete(K key);

  public int size();
}
