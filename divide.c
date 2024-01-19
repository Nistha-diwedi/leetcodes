int divide(int dividend, int divisor) {
    if (dividend == INT_MIN && divisor == -1)
        return INT_MAX;

    int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;

    long long divid = labs(dividend);
    long long divis = labs(divisor);

    long long quotient = 0;

    while (divid >= divis) {
        long long temp = divis, multiple = 1;
        while ((divid >> 1) >= temp) {
            temp <<= 1;
            multiple <<= 1;
        }

        divid -= temp;
        quotient += multiple;
    }

    return sign * quotient;
}
