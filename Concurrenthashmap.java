package com.example.mypackage;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Concurrenthashmap {
    public static void main(String[] args) {
        //Creating a concurrent hashmap
        ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
        map.put(0,"Java");
        map.put(1,"Python");
        map.put(0,"C++");
        map.put(3,"C");
        map.remove(0,"C++");
        map.replace(1,"Python","JS");
        map.putIfAbsent(9, "Bootstrap");
        System.out.println(map);
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for(Integer key:map.keySet()){
            System.out.println(key);
        }
        for(String value:map.values()){
            System.out.println(value);
        }
        System.out.println(map.containsKey(1));
        System.out.println(map.get(1));

        System.out.println(map.size());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("JS"));
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map);
        System.out.println(map.size()); 

    }
}
