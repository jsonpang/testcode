import java.util.*;

class _map {
    public static void main(String[] args) {
        // init
        Map<String, String> map = new HashMap<String, String>();
        map.put ("key","value");
        map.put ("qwe","hhhhh");
        map.put ("key","value2");
        System.out.println(map);  //print all the  elememnt
        System.out.println(map.get("qwe")); //get value
        System.out.println(map.remove("key")); //remove key will print value
        System.out.println(map); //after remove one key
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>(); //interger
        map1.put (1, 2);
        map1.put (3,4);
        System.out.println(map1);
    }
    
}