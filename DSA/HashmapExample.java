import java.util.HashMap;

public class HashmapExample {


    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();

        map.put(12,"Mohankumar");
        map.put(22,"Logesh");
        map.put(4,"Kesavaraman");
        map.put(5,"Barath");

        System.out.println(map);
        System.out.println(map.get(12));
        System.out.println(map.containsValue("Logesh"));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}

