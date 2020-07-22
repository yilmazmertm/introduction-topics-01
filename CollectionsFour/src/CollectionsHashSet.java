import java.util.HashSet;
import java.util.Iterator;

public class CollectionsHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Mert");
        hashSet.add("Yılmaz");
        hashSet.add("MY");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
