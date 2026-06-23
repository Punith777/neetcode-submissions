class Solution {
    public boolean isAnagram(String s, String t) {
    //Hashmap
    HashMap<Character,Integer> map = new HashMap<>();
    
    //process s String first 
    for(char c: s.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
    }

    //process t String: if that char dosent exist in map return false
    for(char c: t.toCharArray()){
        if(!map.containsKey(c)){
            return false;
        }
    // else: decrement map key for that particular t char
        map.put(c,map.get(c)-1);

        if(map.get(c)==0){
            map.remove(c);
        }

    }
    return map.isEmpty();

    }
}
