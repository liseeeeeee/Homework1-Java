package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Java doc comment :
 */

public class LinkedListBasedImpl implements StackOfInts {
    //This class implement the interface named StackOfInts//

    private int numOfElems = 0;
    private Node topNode; // Data on the top of the stack (last one added)

    /**
     * Remove an element from the stack
     */
    @Override
    public int pop() {
        throw new IllegalStateException("To be implemented");
        int temp;
        if ( numOfElems == 0) {
            System.out.println("Sorry, you can't remove anything, your stack is empty");
            return -1;
        }
        else {
            temp = topNode.elem;
            topNode = topNode.next;
            numOfElems -= 1;
        }
        return temp;
    }



    /**
     * Add a new element in the stack
     */
    @Override
    public void push(int x) {
        throw new IllegalStateException();

        Node newNode = new Node(x);

        newNode.next = topNode;
        topNode = newNode;

        numOfElems += 1;
    }


    /**
     * Getter because numOfElem is private
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }


    /**
     * Take the top value (last one added) without remove it
     */
    @Override
    public int peek() {
        throw new IllegalStateException("To be implemented");

        if (numOfElems == 0) {
            System.out.println("Your stack is empty");
            return -1;
        }
        else {
            return topNode.elem;
        }
    }

    /**
     * Node is a nested class
     */
    private static class Node {

        private int elem; // data we will add to stack

        Node next; // simply next node, going to the first value added (not declared private in order to let big class access it)

        public Node(int elem) // constructor
        {
            this.elem = elem;
        }

    }

    public static void main(String[] args){
        LinkedListBasedImpl newObjet = new LinkedListBasedImpl();

        newObjet.push(12);
        newObjet.push(25);
        newObjet.push(33);
        newObjet.push(67);

        System.out.println(newObjet.peek);
    }
}
