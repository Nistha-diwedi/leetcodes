class number_Of_Employees_Who_Met_Target {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int yes = 0;
        for(int i=0; i<hours.length; i++){
            if(hours[i] >= target){
                yes = yes + 1;
            }
        }
        return yes;
    }
}
