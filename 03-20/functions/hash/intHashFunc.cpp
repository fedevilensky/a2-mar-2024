#pragma once

#include "hashFunc.cpp"

class intHashFunc : public hashFunc<int>
{
public:
  int hash(int data) override { return data; }
};
