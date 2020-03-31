package com.laziv.lesson14.task2;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getLength() == o2.getLength()){
            return 0;
        }
        else if(o1.getLength() < o2.getLength()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
