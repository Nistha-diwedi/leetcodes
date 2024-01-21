class concatenation {
    public int[] getConcatenation(int[] nums) {
        int n = 2*(nums.length);
        int s = nums.length;
        int[] ans = new int[n];
        for(int i=0; i < n; i++){
            if(i < s){
                ans[i] = nums[i];
                ans[i+s] = nums[i];
            }
        }
        return ans;
    }
}
