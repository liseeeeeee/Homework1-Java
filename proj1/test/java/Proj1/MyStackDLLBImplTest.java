package Proj1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {

    public static void main(String[] args) {
        MyStack<Integer> element = MyStack.create();

        element.push(2);
        element.push(5);
        element.push(6);

        System.out.println("Push, peek and numOfElems work:");
        element.displayMyStack();
        System.out.println("Top element is "+ element.peek() + " and there are " + element.numOfElems() +" items in the Stack\n");

        element.pop();
        element.pop();
        System.out.println("Pop works:");
        element.displayMyStack();

        element.pop();
        System.out.println("Pop to remove all elements works:");
        element.displayMyStack();

        /**
         * Remove comment in the following to test throw (when we want to dequeue but Queue is empty)
         * You will see the message: 'You cannot remove, your Queue is empty'
         */
        /*element.pop();
        System.out.println("Pop when there is no element works:");
        element.displayMyStack();*/


    }
}