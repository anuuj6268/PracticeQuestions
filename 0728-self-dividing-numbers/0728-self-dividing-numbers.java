class Solution {
public static boolean isSelf(int num){
int number = num;
int count = 0;
    int leng = 0;

while(num!=0){
int n1 = num%10;
if(n1==0){
    return false;
}
if(number%n1==0){
    count++;
}
leng++;
num = num/10;
}
if(leng==count){
    return true;
}
return false;
}
    public List<Integer> selfDividingNumbers(int left, int right) {
ArrayList<Integer> list = new ArrayList<>();
for(int i = left;i<=right;i++){
if(isSelf(i)){
list.add(i);
}
}



return list;

    }
}