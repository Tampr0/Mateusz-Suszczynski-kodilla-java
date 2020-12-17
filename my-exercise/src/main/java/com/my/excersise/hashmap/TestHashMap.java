package com.my.excersise.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        HashMapMaker hashMapMaker = new HashMapMaker();
        HashMap<Key, Value> hashMap = hashMapMaker.getHashMap();

        for (Map.Entry<Key, Value> entry : hashMap.entrySet()) { // Map.Entry<K, V> declaration of Entry type
            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println();
        }
    }
}
class HashMapMaker {

    private HashMap<Key, Value> hashMap;

    public HashMapMaker() {
        HashMap<Key, Value> hashMap = new HashMap<>();
        hashMap.put(new Key("Jennifer", "Nowak", "12345678901"), new Value(5000.0, 3000.0, 0.0, 0.0));
        hashMap.put(new Key("Sarah", "Taylor", "12345612345"), new Value(4000.0, 2000.0, 1000.0, 0.0));
        hashMap.put(new Key("Laura", "Pinelli", "12345698765"), new Value(4500.0, 3500.0, 0.0, 0.0));
        hashMap.put(new Key("Laura", "Pinelli", "12345045678"), new Value(11000.0, 0.0, 2000.0, 1000.0));
        this.hashMap = hashMap;
    }

    public HashMap<Key, Value> getHashMap() {
        return this.hashMap;
    }
}

