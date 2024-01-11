package org.basic;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    public int compare(Integer obj1, Integer obj2) {
        if (obj1 > obj2) {
            return 1;
        } else if (obj1 < obj2) {
            return -1;
        } else {
            return 0;
        }
    }

}
