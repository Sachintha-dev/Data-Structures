import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list  = new LinkedList();
        //list.addFirst(10);
        //list.addLast(10);
        list.addFirst(30);
        //list.addFirst(50);
        //list.revese();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));


    }
}