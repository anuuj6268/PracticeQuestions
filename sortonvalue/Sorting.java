package com.mycompany.sortonvalue;
import java.util.*;

public class Sorting implements Comparator<String>{
TreeMap<String,Integer> map = new TreeMap<>();
    public Sorting(TreeMap<String,Integer> map){
        this.map = map;
    }
    @Override
    public int compare(String o1, String o2) {
    char[] ch1 = o1.toCharArray();
    char[] ch2 = o2.toCharArray();
    
    if(ch1[2]>ch2[2]){
        return 1;
    }
    return -1;
    
    }
    
    
    
    
    
}

