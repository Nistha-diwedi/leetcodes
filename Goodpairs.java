class Goodpairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=1; j<nums.length; j++){
                if(nums[i] == nums[j] & i < j){
                    count += 1;
                }
            }
        }
        return count;
    }
}
