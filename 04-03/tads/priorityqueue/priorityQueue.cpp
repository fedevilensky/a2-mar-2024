#pragma once

template <class E, class P>
class PriorityQueue
{
public:
  virtual void push(E element, P priority) = 0;

  virtual E pop() = 0;

  virtual E top() = 0;

  virtual bool isEmpty() = 0;

  virtual int size() = 0;
};
