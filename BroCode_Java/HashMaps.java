import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // Hashmaps -> a data structure that stores key-value pairs
        // Keys are unique, but Values can be duplicated
        // does not maintain any order, but is memory efficient
        // HashMap<key, value>

        HashMap<String, Double> map = new HashMap<>(); // here we told Java that we made a hashmap that takes String as keys and Double as Values

        map.put("KitKat", 234.99); // Associates the specified value with the specified key in this map
        map.put("Munch Max", 34.99);
        // map.put("Munch Max", 43.99); // if key is duplicated then, the previous value of that key is overidden
        map.put("Dairy Milk", 12.99);
        map.put("5 Star", 23.99); 

        map.remove("Dairy Milk"); // removes the specified key from the HashMap

        // System.out.println(map); // map is printed in the form of key=value pair
        System.out.println(map.get("KitKat")); // Returns the value to which the specified key is mapped, or null
        System.out.println(map.containsKey("Snickers")); // returns boolean value if the specified key is in the map or not

        System.out.println(map.containsValue(34.99)); // returns boolean value if the specified value is in the map or not

        System.out.println(map.size()); // returns the size of the map

        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
        // keySet() -> Returns a Set view of the keys contained in this map
    }
}
