package oop.withjava;

import java.util.ArrayList;

public class BetterArrayList extends ArrayList<Integer> {
    public Integer pop() {
        return remove(size() - 1);
    }
}
