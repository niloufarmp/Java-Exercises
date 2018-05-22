import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * this class checks if two LinkedHashMaps have same keys & values.
 * In case one map contains an extra (key, value) it will be stored in extraMap.
 * otherwise if only key or value is different between maps then it will be stored in differencesMap.
 *
 * @author Niloufar Mazloumpour
 * @mail niloufar@mazloumpour.net
 * @since 2018-05-22
 */
public class MapCompare {
    private LinkedHashMap<String, String> differencesMap;
    private LinkedHashMap<String, String> extraMap;

    private void main(LinkedHashMap<String, String> map1, LinkedHashMap<String, String> map2) {
        this.differencesMap = new LinkedHashMap<>();
        this.extraMap = new LinkedHashMap<>();

        Set<Map.Entry<String, String>> set1 = ((LinkedHashMap<String, String>) map1.clone()).entrySet();
        Set<Map.Entry<String, String>> set2 = ((LinkedHashMap<String, String>) map2.clone()).entrySet();

        set1.removeAll(set2);
        compare(set1, map2);

        set1 = map1.entrySet();

        set2.removeAll(set1);
        compare(set2, map1);
    }

    private LinkedHashMap<String, String> getDifferencesMap() {
        return differencesMap;
    }

    private LinkedHashMap<String, String> getExtraMap() {
        return extraMap;
    }

    private void compare(Set<Map.Entry<String, String>> set, LinkedHashMap<String, String> map) {
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (map.containsKey(key) || map.containsValue(value)) {
                differencesMap.put(key, value);
            } else {
                extraMap.put(key, value);
            }
        }
    }

    public static void main(String[] args) {
        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("A", "a");
        map1.put("B", "b");
        map1.put("C", "c");
        LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
        map2.put("A", "a");
        map2.put("C", "c");
        map2.put("B", "r");
        map2.put("Z", "z");

        MapCompare mapCompare = new MapCompare();
        mapCompare.main(map1, map2);

        System.out.println("diff: " + mapCompare.getDifferencesMap());
        System.out.println("extra: " + mapCompare.getExtraMap());
    }
}

