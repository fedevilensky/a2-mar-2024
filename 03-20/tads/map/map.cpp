#pragma once

#include "../iterable/iterable.cpp"

template <class K, class V>
class map : public iterable<pair<K, V>>
{
public:
  virtual bool has(K key) = 0;

  virtual V get(K key) = 0;

  virtual void set(K key, V value) = 0;

  virtual void remove(K key) = 0;

  virtual int size() = 0;
};
