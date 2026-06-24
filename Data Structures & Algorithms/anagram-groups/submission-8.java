class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String str: strs){
            char chars[] = str.toCharArray();
            Arrays.sort(chars); // sort that particular string after converting to char

            //again convert it back to the string
            String key = new String(chars);

            // if that particular sorted str is not already in the map, put that as key 
            // and empty array as the value 
            map.putIfAbsent(key, new ArrayList<>());
            
            //else if that key already exists, put that string for that key
            map.get(key).add(str);

        }
        return new ArrayList<>(map.values());
    }
}
