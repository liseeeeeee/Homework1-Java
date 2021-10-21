package Proj1;

//import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    public static void main(String[] args) {
        MyQueue<Integer> element = MyQueue.create();

        element.enqueue(2);
        element.enqueue(5);
        element.enqueue(6);

        System.out.println("Enqueue, peek and numOfElems work:");
        element.displayMyQueue();
        System.out.println("Top element is "+ element.peek() + " and there are " + element.numOfElems() +" items in the Stack\n");

        element.dequeue();
        element.dequeue();
        System.out.println("Dequeue works:");
        element.displayMyQueue();

        element.dequeue();
        System.out.println("Dequeue to remove all elements works:");
        element.displayMyQueue();

        /**
         * Remove comment in the following to test throw (when we want to dequeue but Queue is empty)
         * You will see the message: 'You cannot remove, your Queue is empty'
         */
        /*element.dequeue();
        System.out.println("Dequeue when there is no element works:");
        element.displayMyQueue();
         */

    }
}