class Solution {
    public int longestConsecutive(int[] nums) {
        //create an hashset for nums because it will search an element with O(n)
        HashSet<Integer> set = new HashSet<>();

        //add all numbers to the HashSet:
        for(int num: nums){
            set.add(num);
        }

        // to store the length of the longest sequence found
        int longestSequence =0;

        // traverse through the HashSet

        for(int num: set){
            // check if the current num is the start of a sequence
            // if num-1 exists, then number belongs to an already existing sequence so skip it
            if(!set.contains(num-1)){
                int current = num; //we will start building the sequence from here if no predecessors are there
                int length = 1; //initially sequence contains only the current number

                //so now keep checking if the next consecutive number exists
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                longestSequence = Math.max(longestSequence, length);
            }
        }   
        return longestSequence;

    }
}
