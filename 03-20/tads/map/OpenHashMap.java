package tads.map;

import java.util.ArrayList;
import java.util.Iterator;

import functions.hash.HashFunc;

public class OpenHashMap<K, V> implements Map<K, V> {
  private HashFunc<K> hashFunc;
  private Object[] arr;
  private int elems;

  private int abs(int x) {
    if (x < 0) {
      return -x;
    }
    return x;
  }

  public OpenHashMap(HashFunc<K> hashFunc, int expectedSize) {
    this.hashFunc = hashFunc;
    this.arr = new Object[expectedSize * 2 - 1];
  }

  @Override
  public boolean has(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'has'");
  }

  @Override
  public V get(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public void set(K key, V value) {
    int h = this.hashFunc.hash(key);
    int pos = abs(h) % arr.length;

    ArrayList<Pair<K, V>> list = (ArrayList<Pair<K, V>>) arr[pos];
    if (list == null) {
      list = new ArrayList<>();
      list.add(new Pair<>(key, value));
      arr[pos] = list;
      elems++;
    } else {
      Pair<K, V> p = new Pair<>(key, value);
      if (list.contains(p)) {
        list.remove(p);
        elems--;
      }

      list.add(p);
      elems++;
    }
  }

  @Override
  public int size() {
    return this.elems;
  }

  @Override
  public void delete(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Iterator<Pair<K, V>> iterator() {
    ArrayList<Pair<K, V>> itList = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      ArrayList<Pair<K, V>> l = (ArrayList<Pair<K, V>>) arr[i];
      if (l != null) {
        Iterator<Pair<K, V>> it = l.iterator();
        while (it.hasNext()) {
          Pair<K, V> p = it.next();
          itList.add(p);
        }
      }
    }

    return itList.iterator();
  }

}
