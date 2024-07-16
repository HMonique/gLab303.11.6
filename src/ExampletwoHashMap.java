import java.util.HashMap;

public class ExampletwoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<>();

        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key 4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains:" + newHashMap);

        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings= " + copyHashMap);
        System.out.println("copyHashMap after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());
    }
}
