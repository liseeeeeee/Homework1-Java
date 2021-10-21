package Proj1;

import Proj1.MyQueueDLLBImpl;

/**
 * Interface MyQueue is implemented in MyQueueDLLBImp class. It contains all functions used in this class
 * As you can see, we will use generic in order to be able tu create quaue and stack with integers, or string
 * or characters...
 * @param <E>
 */
public interface MyQueue<E> {
    /**
     * Allows us to add an element at the beginning of the Queue
     * @param x
     */
    void enqueue(E x);

    /**
     * Allows us to remove the last element of the Queue, so the first we enqueued
     * @return
     */
    E dequeue();

    /**
     * Will count the number of elements in the Queue
     * @return
     */
    int numOfElems();

    /**
     * Return the number on the top of the Queue (last one we added)
     * @return
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }

    /**
     * To display the Queue
     */
    void displayMyQueue();
}
