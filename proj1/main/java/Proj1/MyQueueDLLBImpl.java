package Proj1;

import Proj1.MyQueue;

/**
 * Here we will implement a Queue. In a Queue, we enqueue on a side and dequeue on the other side.
 * We will consider beginning is on the left, so we will enqueue on the left and dequeue on the left.
 * @param <E>
 */
public class MyQueueDLLBImpl<E> implements MyQueue<E> {

    private DLinkList<E> elems = new DLinkList<>();

    /**
     * In order to enqueue, we want to add an element at the beginning of the Queue, so we will call the function
     * addFirst which is defined in 'DLinkList.java'.
     */
    @Override
    public void enqueue(E x) {
        elems.addFirst(x);
        //throw new IllegalStateException("To be implemented");
    }


    /**
     * In order to dequeue, we want to add an element at the end of the Queue, so we will call the function
     * removeLast which is defined in 'DLinkList.java'.
     * @return
     */
    @Override
    public E dequeue() {
        return elems.removeLast();
        //throw new IllegalStateException("To be implemented");
    }

    /**
     * In order to know the number of elements we have in the Queue, it calls method 'numOfElems' that ever exist in
     * 'DLinkList'
     * @return
     */
    @Override
    public int numOfElems() {
        return elems.numOfElems();
    }

    /**
     * Peek is a function which display the "top node" so the element wish is at the beginning of the Queue(on the left)
     * it calls method 'peek' that ever exist in 'DLinkList'
     * @return
     */
    @Override
    public E peek() {
        return elems.peek();
        //throw new IllegalStateException("To be implemented");
    }

    /**
     * We will use this function in test, it will display the Queue and let us know if all methods work well,
     * it calls method 'display' that ever exist in 'DLinkList'
     */

    @Override
    public void displayMyQueue(){
        elems.display();
    }
}
