class kids_With_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int max = 0;
        int s = 0;
        for(int i=0; i<candies.length; i++){
            max = Math.max(max,candies[i]);
        }        
        for(int i=0; i<candies.length; i++){
            s = candies[i] + extraCandies;
            if(s >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}
