class Solution {
int value(char c){
    switch(c){
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        default: return 1000;
    }
}

    public int romanToInt(String s) {
int sum = 0;
for(int i = 0;i<s.length();i++){
    int curr = value(s.charAt(i));
    int next = (i < s.length() - 1) ? value(s.charAt(i + 1)) : 0;
 
 if(curr<next){
    sum = sum - curr;
 }
 else{
sum = sum + curr;
 }

}



//     HashMap<Character,Integer> map = new HashMap<>();
//     map.put('I',1);
//     map.put('V',5);
//     map.put('X',10);
//     map.put('L',50);
//     map.put('D',500);
//     map.put('C',100);
//     map.put('M',1000);

// int sum = 0;

// for(int i = 0;i<s.length();i++){
//     if(i<s.length()-1 && map.get(s.charAt(i+1))>map.get(s.charAt(i))){
//         sum = sum - map.get(s.charAt(i)); 
//     }
//     else{
//         sum = sum + map.get(s.charAt(i));
//     }
// }


return sum;

    }
}