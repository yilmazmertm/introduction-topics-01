import java.util.HashMap;
import java.util.Map;

public class CollectionsHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Mert", "Yılmaz");
        hashMap.put("Hasan", "Yılmaz");
        hashMap.put("Sercan", "Yılmaz");

        System.out.println("Value for 1 is :" + hashMap.get("Mert"));

        for(Map.Entry<String, String> e: hashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
