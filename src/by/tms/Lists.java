package by.tms;

import by.tms.vehicle.VehicleRoad;

import java.util.*;

public class Lists {

    void bench(List<String> a) {
        long l = System.currentTimeMillis();
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
    public static void main(String[] args) {
        List<String> tet = new ArrayList<>();
        tet.add("1");
        tet.add("2");
        tet.add("3");
        tet.add("4");
        tet.add("5");
        System.out.println(tet.get(2));
        LinkedList<String> tet2 = new LinkedList<>();
        tet2.add("1");
        tet2.add("2");
        tet2.add("3");
        tet2.add("4");
        tet2.add("5");
        System.out.println(tet2.getLast());
        Iterator<String> iterator1 = tet.iterator();
        Iterator<String> iterator2 = tet.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());
        Set<VehicleRoad> strings = new TreeSet<>();
        strings.add(new VehicleRoad());
        strings.add(new VehicleRoad());
//        strings.add("Hello2");
//        strings.add("Hello1");
//        strings.add("Hello2");
//        System.out.println(strings);


        // VehicleRoad
//        TreeSet
//        Queue queue = new
        List<String> strs = new ArrayList<>();
        List<String> strs2 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            strs.add("hello");
            strs2.add("hello");
        }
    }
}
