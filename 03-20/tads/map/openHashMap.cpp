#pragma once

#include "map.cpp"
#include "pair.cpp"
#include "../../functions/hash/hashFunc.cpp"
#include "<path relativo a su lista>"

template <class K, class V>
class openHashMap : public map<K, V>
{
public:
  openHashMap(hashFunc<K> func, int expectedSize)
  {
    this->func = func;
    this->arrSize = expectedSize * 2 - 1;
    this->elems = 0;
    this->arr = new *list<*pair<k, v>>[arrSize];
  }

  boole has(K key) override
  {
  }

  V get(K key) override
  {
  }

  void set(K key, V value) override
  {
    int h = this->func->hash(key);
    int pos = abs(h) % arrSize;

    list<*pair<K, V>> *l = arr[pos];
    if (l == nullptr)
    {
      l = new list<*pair<K, V>>();
      l->add(new pair<K, V>(key, value));
      arr[pos] = l;
      elems++;
    }
    else
    {
      pair<K, V> *p = new pair<K, V>(key, value);
      if (l->contains(p))
      {
        l->remove(p);
        elems--;
      }

      l->add(p);
      elems++;
    }
  }

  int size() override
  {
    return this->elems;
  }

  void remove(K key) override
  {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  Iterator<pair<K, V>> iterator() override
  {
    list<*pair<K, V>> *itList = new list<*pair<K, V>>();
    for (int i = 0; i < arrSize; i++)
    {
      list<*pair<K, V>> *l = arr[i];
      if (l != nullptr)
      {
        iterator<pair<K, V>> *it = l->iterator();
        while (it->hasNext())
        {
          pair<K, V> p = it->next();
          itList->add(p);
        }
      }
    }

    return itList->iterator();
  }

private:
  hashFunc<K> func;
  list<*pair<K, V>> **arr;
  int arrSize;
  int elems;

  int abs(int x)
  {
    if (x < 0)
    {
      return -x;
    }
    return x;
  }
};
