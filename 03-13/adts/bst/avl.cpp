#pragma once

#include "bst.cpp"

template <class T>
struct AVLNode
{
  T data;
  AVLNode<T> *left = nullptr;
  AVLNode<T> *right = nullptr;
  int height = 1;

  AVLNode(T data)
  {
    this->data = data;
  }
};

template <class T>
class AVL : public BST<T>
{
private:
  AVLNode<T> *root = nullptr;
  int elements = 0;

  int nodeHeight(AVLNode<T> *node)
  {
    if (node == nullptr)
    {
      return 0;
    }
    else
    {
      return node->height;
    }
  }

  int balanceFactor(AVLNode<T> *node)
  {
    return nodeHeight(node->left) - nodeHeight(node->right);
  }

  int max(int a, int b)
  {
    if (a > b)
    {
      return a;
    }
    return b;
  }

  AVLNode<T> *insertNode(AVLNode<T> *node, T data)
  {
    if (node == nullptr)
    {
      this->elements++;
      return new AVLNode<T>(data);
    }
    // else
    if (node->data == data)
    {
      return node;
    }
    // else
    if (data > node->data)
    {
      node->right = insertNode(node->right, data);
    }
    else
    {
      node->left = insertNode(node->left, data);
    }

    node->height = 1 + max(nodeHeight(node->left), nodeHeight(node->right));

    int bF = balanceFactor(node);
    if (bF > 1)
    {
      // desbalanceado a la izq-?
      int bfLeft = balanceFactor(node->left);
      if (bfLeft > 0)
      {
        return rightRotation(node);
      }
      else if (bfLeft < 0)
      {
        return leftRightRotation(node);
      }
    }
    if (bF < -1)
    {
      int bfRight = balanceFactor(node->right);
      if (bfRight > 0)
      {
        return leftRotation(node);
      }
      else if (bfRight < 0)
      {
        return rightLeftRotation(node);
      }
    }

    return node;
  }

  AVLNode<T> *leftRotation(AVLNode<T> *node)
  {
    /*
     *    z               y
     *   / \             / \
     *  a   y    =>     z   x
     *     / \         / \
     *    b   x       a   b
     */

    AVLNode<T> *z = node;
    AVLNode<T> *y = node->right;

    z->right = y->left;
    y->left = z;

    z->height = 1 + max(nodeHeight(z->left), nodeHeight(z->right));
    y->height = 1 + max(nodeHeight(y->left), nodeHeight(y->right));

    return y;
  }

public:
  void insert(T data) override
  {
    this->root = insertNode(this->root, data);
  }

  int height() override
  {
    return nodeHeight(this->root);
  }

  int size() override
  {
    return this->elements;
  }
};
