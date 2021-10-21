package Proj1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {

    public static void main(String[] args) {

        DLinkList<Integer> element = new DLinkList<>();         // create Object of Implementing class
        /**
         * First, we verify that stack function works well
         */
        // insert Stack value at the first position(push)
        System.out.printf("Begin test for Stack");
        element.addFirst(4);
        element.addFirst(32); //we add at the beginnig, first position is on the left so we should have 32->4
        element.addFirst(9);  //We should have 9->32->4
        element.addFirst(57); //We should have 57->9->32->4

        System.out.println("\nWe add four elements in the stack: ");
        element.display();      //We display a first time to verify it works well

        // print Top element of Stack
        System.out.println("\nTop element is "+ element.peek() + " and there are " + element.numOfElems() +" items in the Stack"); //expected : 57 and 4

        // Delete top element of Stack
        element.removeFirst(); //the beginning of the queue/stack is still on the left
                               // and we want to remove the first element of the fist element, so we want to remove 57
        element.removeFirst(); //remove 9

        System.out.println("We remove two elements from the stack: ");
        element.display();

        System.out.println("\nTop element is " + element.peek());//expected : 32
        System.out.println("Remove all elements from the stack: ");
        element.removeFirst();
        element.removeFirst();
        //element.removeFirst(); //remove the comment here to try throw exception. Expected: compilation error with message

        element.display();
        System.out.println("\nTop element is " + element.peek());//expected : null

        /**
         * Now, Queue.
         */
        System.out.println("Now test for Queue");
        // insert a value at the beginning (Enqueue), we still use add first
        element.addFirst(4);
        element.addFirst(32); //Expected 32->4
        element.addFirst(9);  //Expected 9->32->4
        element.addFirst(57); //Expected 57->9->32->4

        System.out.println("\nAdd again our all elements we deleted in Stack test: ");
        element.display();

        // print Top element of Stack
        System.out.println("\nTop element is " + element.peek()); //expected : 57

        // Delete top element of Stack
        element.removeLast(); //So we want to remove the value at the end (on the right) that means 4
        element.removeLast(); //remove 32

        System.out.println("Remove two elements from the Queue: ");
        element.display();

        System.out.println("Remove all elements from the stack: ");
        element.removeLast();
        element.removeLast();
        element.display();
        System.out.println("\nTop element is " + element.peek());//expected : null

        /**
         * I explain in DLinkList that we don't need addLast for stack and queue but I implement it
         * in order to verify I understood well how it works so let's try this method:
         */
        System.out.printf("\n Now test if we can add an element at the end of the Stack/Queue beginning with this list: ");
        element.addFirst(9);
        element.addFirst(57);
        element.display();

        element.addLast(32);
        element.addLast(4);

        System.out.println("\nWe add two elements at the end: ");
        element.display();
    }

    /**
     * It also works with string by replacing :
     *        " DLinkList<Integer> element = new DLinkList<>(); "
     *  by:   " DLinkList<String> element = new DLinkList<>(); "
     *
     *  and all number in addFirst and addLast by a string
     *  (ex: "Hello" "It" "Works" "Well"
     */

}