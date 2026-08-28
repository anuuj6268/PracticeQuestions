class Solution {
    public List<List<String>> groupAnagrams(String[] string) {
        Map<String,List> map = new HashMap<>();
        for(String s : string){
            int[] arr = new int[26];
            for(char ch:s.toCharArray()){
                arr[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int a : arr){
                sb.append("#");
                sb.append(a);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }   



            map.get(key).add(s);
        }

return new ArrayList(map.values());
    }
}