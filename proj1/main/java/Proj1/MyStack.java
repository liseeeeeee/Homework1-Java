package Proj1;

import Proj1.MyStackDLLBImpl;

/**
 * Interface MyStack is implemented in MyStackDLLBImp class. It contains all functions used in this class
 * As you can see, we will use generic in order to be able tu create quaue and stack with integers, or string
 * or characters...
 * @param <E>
 */
public interface MyStack<E> {
    /**
     * Pop allows us to remove the last element added in a Stack
     * @return
     */
    E pop();

    /**
     * Push allows us to add an element in a Stack
     * @param x
     */
    void push(E x);


    /**
     * Will count the number of elements in the Stack
     * @return
     */
    int numOfElems();

    /**
     * Return the number on the top of the stack (last one we added)
     * @return
     */
    E peek();

    /**
     * To display the Stack
     */
    void displayMyStack();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
