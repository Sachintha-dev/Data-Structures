public class Array {
    private int array[];
    private int count;

    public Array(int length) {
        array = new int[length];

    }
    public void print(){
        for (int i = 0 ; i < count ; i++)
            System.out.println(array[i]);
    }
    public void insert(int item){
        if (array.length == count) {
            int[] tempArray = new int[count*2];
            for (int i = 0 ; i < count;i++)
                tempArray[i] = array[i];
            array = tempArray;
        }
        this.array[count] = item;
        count++;
    }
    public void removeAt(int index) {
        if(index < 0 || index > count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++) {
            array[i] = array[i+1] ;
            count--;
        }
    }
    public int indexOf(int value){
        int index = -1;
        for (int i = 0 ; i < count ;i++){
            if(array[i] == value)
                index = i;
        }
            return index;
    }


}
