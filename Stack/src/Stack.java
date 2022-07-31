import java.util.Arrays;

public class Stack {
    /*    TODO:push
          TODO:pop
          TODO:peek
          TODO:isEmpty
     */
    private int[] array;
    private int count = 0;

    public Stack(int size) {
        this.array = new int[size];
    }

    private boolean isArryFull() {
        return (array.length == count);
    }

    public void push(int item) {
        if (isArryFull()) {
            throw new StackOverflowError();
        }
        array[count++] = item;

    }

    public boolean isEmpty() {
        return (array.length == 0);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return array[--count];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return array[count - 1];
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(array, 0, count);
        return (Arrays.toString(content));
    }

}
