#pragma once
#include "priorityQueue.cpp";

template <class E, class P>
struct MinHeapPair
{
  E fst;
  P snd;

  MinHeapPair(E fst, P snd)
  {
    this.fst = fst;
    this.snd = snd;
  }
};

template <class E, class P>
class MinHeap : PriorityQueue<E, P>
{
private:
  MinHeapPair<E, P> **heap;
  // cantidad de elementos en el heap
  int heapSize;
  // tamanio del array
  int heapLength;

  void swap(int a, int b)
  {
    MinHeapPair<E, P> *aux = heap[a];
    heap[a] = heap[b];
    heap[b] = aux;
  }

  bool parentIsGreater(P child, P parent)
  {
    return parent > child;
  }

public:
  void push(E element, P priority) override
  {
    heapSize++;
    if (heapLength <= heapSize)
    {
      MinHeapPair **newHeap = new MinHeapPair *[heapLength * 2];
      for (int i = 1; i < heapLength; i++)
      {
        newHeap[i] = heap[i];
      }
      heap = newHeap;
      heapLength = heapLength * 2;
    }

    MinHeapPair<E, P> *pair = new MinHeapPair<E, P>(element, priority);
    heap[heapSize] = pair;

    siftUp(heapSize);
  }

  void siftUp(int pos)
  {
    int parentPos = pos / 2;
    if (parentPos < 1)
    {
      return;
    }

    MinHeapPair<E, P> *parent = heap[parentPos];
    MinHeapPair<E, P> *node = heap[pos];

    if (parentIsGreater(node->snd, parent->snd))
    {
      swap(pos, parentPos);
      siftUp(parentPos);
    }
  }

  E pop() override
  {
    // TODO Auto-generated method stub
  }

  E top() override
  {
    // TODO Auto-generated method stub
  }

  bool isEmpty() override
  {
    // TODO Auto-generated method stub
  }

  int size() override
  {
    // TODO Auto-generated method stub
  }
};
