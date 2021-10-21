package Proj1;

import Proj1.MyStack;

/**
 * Here we will implement a Stack. In a stack, we push and pop on the same side.
 * We will consider beginning is on the left so we will push and pop on the left.
 * @param <E>
 */

public class MyStackDLLBImpl<E> implements MyStack<E> {

    private DLinkList<E> elems = new DLinkList<>();

    /**
     * In order to pop, we want to remove an element at the end of the Stack, so we will call the function
     * removeFirst which is defined in 'DLinkList.java'.
     * @return
     */
    @Override
    public E pop() {
        //throw new IllegalStateException("To be implemented");
        return elems.removeFirst();

    }

    /**
     * In order to push, we want to add an element at the beginning of the Stack, so we will call the function
     * addFirst which is defined in 'DLinkList.java'.
     */
    @Override
    public void push(E x) {
        //throw new IllegalStateException("To be implemented");
        elems.addFirst(x);
    }

    /**
     * In order to know the number of elements we have in the Stack.
     * It calls method 'numOfElems' that ever exist in 'DLinkList'
     * @return
     */
    @Override
    public int numOfElems() {
        //throw new IllegalStateException("To be implemented");
        return elems.numOfElems();
    }

    /**
     * Peek is a function which display the "top node" so the element wish is at the beginning of the Stack(on the left)
     * It calls method 'peek' that ever exist in 'DLinkList'
     * @return
     */
    @Override
    public E peek() {
        //throw new IllegalStateException("To be implemented");
        return elems.peek();
    }

    /**
     * We will use this function in test, it will display the Stack and let us know if all methods work well
     * It calls method 'display' that ever exist in 'DLinkList'
     */
    @Override
    public void displayMyStack(){
        elems.display();
    }
}
