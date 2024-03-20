#pragma once

template <class T>
class hashFunc
{
public:
  virtual int hash(T data) = 0;
};
