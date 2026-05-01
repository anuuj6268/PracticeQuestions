package com.mycompany.sortonvalue;
import java.util.*;
public class SortOnValue {

    public static void main(String[] args) {
  TreeMap<String,Integer> map= new TreeMap<>();
  map.put("anant", 12);
  map.put("adarsh", 11);
  map.put("aditya", 155);
  map.put("anuj", 163);
  map.put("roshan", 0);
  map.put("prem", 1200);
  map.put("paridhi", 1202);
  map.put("sandeep", 125642);
   
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" "+value);
        }
        
        System.out.println("===================================");
       
  Comparator<String> cmp = new Sorting(map);
  TreeMap<String,Integer> map2 = new TreeMap<>(cmp);
  map2.putAll(map);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" "+value);
        }  


    }
}
