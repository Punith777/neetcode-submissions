class Solution {
    public boolean isAnagram(String s, String t) {
        // check the length first:
        if(s.length()!=t.length()){
            return false;
        }

        // first sort the array then if they are same then true
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}
