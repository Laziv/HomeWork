package com.laziv.lesson14.task2;

import java.util.Comparator;

public class CommodityWidthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getWidth() == o2.getWidth()){
            return 0;
        }
        else if(o1.getWidth() < o2.getWidth()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
