#include "list.cpp"

template <class T>
struct ListNode {
    T elem;
    ListNode<T>* next;
};

template<class T>
class LinkedList: List<T>{
private:
    ListNode<T>* root;

public:
    override void add (T elem){
        ListNode<T>* newNode = new ListNode<T>();
        newNode->elem = elem;
        newNode->next = root;
        root = newNode; 
    }
};