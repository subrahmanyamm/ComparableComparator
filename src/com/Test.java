package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("Dell",8,800);
        Laptop lap2 = new Laptop("Acer",12,700);
        Laptop lap3 = new Laptop("Apple", 16,1200);

        List<Laptop> laps = new ArrayList<>();
        laps.add(lap1);
        laps.add(lap2);
        laps.add(lap3);

        Comparator<Laptop> comparable = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop l1,Laptop l2) {
                if(l1.getPrice()>l2.getPrice())
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(laps,comparable);

        System.out.println(laps);

        Collections.sort(laps);
        System.out.println(laps);
    }
}
