package Proj1;

/**
 * @param <E>
 * In this class, we will define all function which are called in MyQueueDLLBImpl and MyStackDLLBImpl
 * In a Queue, we add at the beginning, and remove from the end. So in class MyQueueDLLBImpl we will call addFirst and removeLast
 * In a Stack, we add at the beginning, and remove from the beginning too. So in class MyStackDLLBImpl we will call addFirst and removeFirst
 */
public class DLinkList<E> {

    public E e;
    private E temp;
    private int numOfElems = 0;
    private Node topNode = null; // Data on the top of the stack (last one added)


    /**
     * @param <T>
     * Node is a nested class, to understand well what it is, if you draw a linked-list, node are all boxes
     */
    private static class Node<T> {
        T elem;         //value inside the node
        Node<T> next;   //the node after ours
        Node<T> prev;   //node that precede ours
    }
    public void addFirst(E e){//Method used in push and enqueue

        Node newNode = new Node();
        newNode.elem = e;       //attribute a value to the new node

        if (isEmpty() != true){
            topNode.prev = newNode;
            newNode.next = topNode;
            topNode = newNode;
            newNode.prev=null; // "delete" newNode because topNode became newNode

        }else{                 // means that there is no element in the stack/queue, so topNode doesn't exist yet
            topNode = newNode;
        }
        numOfElems += 1;

    }

    /**
     * We don't need the following method because push and enqueue both use addFirst method, so we will have nothing
     * to add at the end, but I implement it anyway to show I understood well how it works
     * @param e
     */
    public void addLast (E e){

        Node newNode = new Node(); //I create a newNode to cross the Queue
        Node temp = topNode;
        if (isEmpty() != true){
            while(temp.next != null){ //cross the queue until the last node
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
            newNode.elem = e;
            newNode.next = null;

        }else{                 // means that there is no element in the stack/queue, so topNode doesn't exist yet
            addFirst(e);
        }
        numOfElems += 1;
    }


    /**
     * Thanks to this function, we will "pop", so it will be used in the Stack to remove an element at the first position
     * (reminder: in stack we push at the beginning so on the left, and we pop the last element we push so the first
     * element on the lef: at the beginning !)
     * We will treat three cases:
     * 1) We want to remove but Queue is empty;
     * 2) There is only one element in the Queue;
     * 3) Queue has 2 elements or more.
     * @return
     */
    public E removeFirst(){
        //pop
        if (topNode == null) {
            throw new IllegalStateException("You cannot remove, your Stack is empty"); //go on line 43 in DLinkListTest and delete comment to test it
        }else {
            E elmt=null;
            if(topNode.next==null){
                topNode=null;
            }
            else {
                topNode = topNode.next;
                topNode.prev = null;
                elmt = (E) topNode.elem; // we can do it, because for elements, in T as in E, it can be the same.
            }
            numOfElems -= 1;
            return elmt;
        }
    }

    /**
     * Thanks to this function, we will dequeue, so it will be used in the Queue to remove an element at the last position
     * (reminder: in stack we enqueue at the beginning so on the left, and we dequeue at the end so on the right).
     * In order to do that we will have to crosse all the Queue until the last element and then remove it.
     * We will treat three cases:
     * 1) We want to remove but Queue is empty;
     * 2) There is only one element in the Queue;
     * 3) Queue has 2 elements or more.
     * @return
     */
    public E removeLast(){
        //dequeue
        Node newNode = new Node(); //I create a newNode to cross the Queue
        newNode = topNode; //att the beginning, my node is on the top
        if(topNode == null){
            throw new IllegalStateException("You cannot remove, your Queue is empty");
        }else {
            E elem = null;
            if (topNode.next == null){
                topNode = null;
            }else{
                do {                        //cross through the Queue...
                    newNode = newNode.next;
                } while (newNode.next != null);//...until the last node!
                newNode = newNode.prev;      //we want to suppress the last element so we go back to the penultimate position
                newNode.next = null;           //delete last position
                elem = (E) newNode.elem;
            }
            numOfElems -= 1;
            return elem;
        }
    }

    public E peek(){
        if (topNode == null){
            return null;
        }
        E elmt;
        elmt = (E) topNode.elem; // we can do it, because for elements, in T as in E, it can be the same.
        return elmt;
    }

    /**
     * Just to know is the Stack/Queue is empty. It will return true if it is empty
     * @return
     */
    public boolean isEmpty()
    {
        return topNode == null;
    }

    /**
     * To return the number of elements we have in the Stack/Queue
     * @return
     */
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * Wi will call this method in the test to display Stack or Queue and verify that it compile well
     */
    public void display()
    {
        String val="";
        // check for stack underflow
        if (isEmpty() == true) {
            System.out.println("\nStack/Queue empty");
        }
        else {
            Node temp = topNode;
            while (temp.next != null) {

                // print node data
                val=val+"-->"+temp.elem.toString();


                // assign temp link to temp
                temp = temp.next;
            }
            val=val+"-->"+temp.elem.toString();
            System.out.println(val);
            //System.out.println("\n");

            /**
             * This part of display is to verify that it works well in both direction.
             */
            /*
            while (temp.prev != null) {

                // print node data
                System.out.println(temp.elem);

                // assign temp link to temp
                temp = temp.prev;
            }
            System.out.println(temp.elem);

             */
        }
    }
}