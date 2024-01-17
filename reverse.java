long int reverse(long int x){
    long int a, b = 0;
    while(x!=0){
        a = x % 10;
        b = b*10 + a;
        x = x / 10;
    }
    if(b>=(-2147483648) & b<=2147483648){
        return b;
    }
    else{
        return 0;
    }
}
