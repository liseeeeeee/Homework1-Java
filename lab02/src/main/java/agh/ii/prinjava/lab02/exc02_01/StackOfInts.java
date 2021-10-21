package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */

/**
 *
 */
public interface StackOfInts {
    int pop();
    /**
     *  public abstract method
     *  pop = remove an element from the stack
     */

    void push(int x);
    /**
     *  public abstract method
     *  this mothod is used to add an element to the stack
     */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }
    /**
     *  this is not abstract
     *  default value for a boolean is false so we suppose that stack is empty and we return that the number of element (in the stack) is 0
     */

    int numOfElems();

    /**
     *  the number of element in the stack
     */

    int peek();
    /**
     *  public abstract method
     *  retreive the last added element without remove it
     */
}
