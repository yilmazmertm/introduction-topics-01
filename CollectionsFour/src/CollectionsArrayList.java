import java.util.ArrayList;

public class CollectionsArrayList {
    public static void main(String[] args) {
        int size = 5;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i<size ; i++){
            array.add(i+10);
        }
        System.out.println(array);
        array.remove(4);
        System.out.println(array);
        for (int i=0 ; i<size - 1; i++){
            System.out.print(array.get(i) + " ");
        }
    }
}
