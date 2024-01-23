class Arraybuild {
    public int[] buildArray(int[] nums) {
        int a = nums.length;
        int[] ans = new int[a];
        for(int i=0; i<a; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
