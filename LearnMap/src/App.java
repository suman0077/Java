import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(2, "two");
		hashMap.put(13, "thirteen");
		hashMap.put(1, "one");
		hashMap.put(100, "hundred");
		

		for (Integer key : hashMap.keySet()) {
			System.out.println(key + ":" + hashMap.get(key));
		}

		for (Map.Entry<Integer, String> map : hashMap.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(2, "two");
		linkedHashMap.put(13, "thirteen");
		linkedHashMap.put(1, "one");
		linkedHashMap.put(100, "Hundred");
		

		for (String key : linkedHashMap.values()) {
			System.out.println(key);
		}

		for (Map.Entry<Integer, String> map : linkedHashMap.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(2, "two");
		treeMap.put(13, "thirteen");
		treeMap.put(1, "one");
		treeMap.put(100, "Hundred");
		

		for (String key : treeMap.values()) {
			System.out.println(key);
		}

		for (Map.Entry<Integer, String> map : treeMap.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}

	}

}
