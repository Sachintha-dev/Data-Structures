public class Main {
    public static void main(String[] args) {
        var list  = new LinkedList();
        list.addFirst(10);
        list.addFirst(30);
        list.addFirst(50);

        System.out.println(list.indexOf(50));


    }
}