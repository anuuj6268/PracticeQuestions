package com.mycompany.stringmethods;

public class StringReverse {
    static public String getReverse(String str){
                String str2="";
        for(int i = str.length()-1;i>=0;i--){
            str2 = str2+str.charAt(i);
        }
       return str2; 
    }
    
    
    public static void main(String[] args) {
        String str = "final";
        System.out.println(getReverse(str));
    }
    
}