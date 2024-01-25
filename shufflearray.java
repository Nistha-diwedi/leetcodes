class shufflearray {
    public int[] shuffle(int[] nums, int n) {
        int arr[]= new int [2*n];
        int j=0;
        int i=n;
        for(int k=0; k<2*n; k++){
            arr[k]=nums[j];
            k++;
            arr[k]=nums[i];
            j++;
            i++;
        }
        return arr;  
    }
}
