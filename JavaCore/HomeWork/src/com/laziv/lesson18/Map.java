package com.laziv.lesson18;

import java.util.Map.Entry;
import java.util.HashMap;

public class Map<K, V> {
    private HashMap<K, V> map = new HashMap<>();

    public void put(K key, V value) {
        map.put(key, value);
    }
    public V remove(Object key){
        return map.remove(key);
    }

    public boolean remove(Object key, Object value){
        return map.remove(key, value);
    }

    public void printKeys(){
        System.out.println("List keys:");
        for (K key : map.keySet()){
            System.out.println(key);
        }
    }

    public void printValues(){
        System.out.println("List values:");
        for (V value : map.values()){
            System.out.println(value);
        }
    }

    public void printMap(){
        for (Entry entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
