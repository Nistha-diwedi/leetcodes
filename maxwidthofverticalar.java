class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] sortx = Arrays.stream(points).mapToInt(point -> point[0]).sorted().toArray();

        int max = 0;
        int w = 0;
        for(int i=0; i<sortx.length-1; i++){
            w = sortx[i+1] - sortx[i];
            if(w > max){
                max = w;
            }
        }
        return max;    
    }
}
