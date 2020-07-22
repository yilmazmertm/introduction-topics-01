import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionsLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        hashSet.add("Mert");
        hashSet.add("Yılmaz");
        hashSet.add("MY");

        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
