public class Main {
    public static void main(String[] args) {
        Array newarray = new Array(10);
        newarray.insert(10);
        newarray.insert(50);
        newarray.insert(70);
        newarray.insert(80);
        newarray.insert(40);
        newarray.insert(20);
        newarray.print();
        System.out.println(newarray.indexOf(20));
        System.out.println();
        newarray.removeAt(5);
        newarray.print();
    }
}
