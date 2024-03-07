#pragma once

template <class T>
class List{
public:
    virtual void add(T elem) = nullptr;
    virtual void delete(int pos) = 0;
    virtual T get(int pos) = 0;
    virtual boolean exists(T elem) = 0;
};