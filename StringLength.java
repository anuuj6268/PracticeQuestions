package com.mycompany.stringmethods;

 public class StringLength {
   static public int countString(String str){
        int length = 0;
        try {
            while(true){
                str.charAt(length);
                length++;
            }
        } catch (Exception e) {
            return length;
        }
    }
    public static void main(String[] args) {
        String str = "Hello There";
        System.out.println(countString(str));   
    } 
}
