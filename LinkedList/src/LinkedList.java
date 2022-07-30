import java.util.NoSuchElementException;

public class LinkedList {
    /*addLast
    * addFirst
    * indexOf
    * contains
    * removeFirst
    * remooveLast
    * size */
    private Node first;
    private Node last;
    private int size;
    private class Node {

        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
        }
        size++;
    }
    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }
    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while(current != null){
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(int item){
       return indexOf(item)  != -1;

    }
    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last) {
            first = last = null;
            size = 0;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;

    }
    public void remooveLast(){

        if(isEmpty())
            throw  new NoSuchElementException();

        if(first == last) {
            first = last = null;
            size = 0;
            return;
        }
        getPrivious(last);
        size--;

    }

    private Node getPrivious(Node node){
        var current = first;
        while (current.next != null){
            if(current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }
    public int getSize(){
        return size;
    }

    public int[] toArray(){
        var current = first;
        int[] array = new int[getSize()];
        int i = 0;
        while (current != last){
            array[i++] = current.value;
            current = current.next;
        }
        return array;
    }

}
