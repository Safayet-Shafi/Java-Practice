import java.util.*;

public class List {
    public void learlingArrayList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        System.out.println("list = " + list);

        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("C");
        set.add(" ");
        set.add(" ");

        System.out.println("set = " + set);

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10); // duplicate

        System.out.println("Treeset = " + numbers);

        Map<Integer,String> map= new HashMap<>();

        map.put(1,"Java");
        map.put(2,"Python");
        System.out.println("Map = " + map);
        System.out.println("Key 1: " + map.get(1));
    }
    
}
