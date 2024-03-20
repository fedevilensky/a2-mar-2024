#pragma once

#include "iterator.cpp"

template <class T>
class iterable
{
public:
  virtual iterator<T> *iterator() = 0;
};
