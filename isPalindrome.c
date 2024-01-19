bool isPalindrome(long int x) {
    if(x<=(-1)){
        return false;
    }
    long int a, b = 0, c = x;
    while(x!=0){
        a = x % 10;
        b = b*10 + a;
        x = x / 10;
    }
    if(c == b){
        return true;
    }
    else{
        return false;
    }
}
