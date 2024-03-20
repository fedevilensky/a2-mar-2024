#pragma once

template <class T1, class T2>
struct pair
{
  T1 fst;
  T2 snd;

  Pair(){};
  Pair(T1 fst)
  {
    this->fst = fst;
  }
  Pair(T1 fst, T2 snd)
  {
    this->fst = fst;
    this->snd = snd;
  }
};
