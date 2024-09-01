
float fatorial (int n) {
    float f=1;
    for (int i =2; i <= n; i++) {
        f = f * i;
    }
    return f;
}

int fib (int n ) {
    if (n<=1) return 1;
    return fib(n-1) + fib(n-2);
}



int main() {
    //printf("inteiro maximo: %d\n", INT_MAX);
    // for (int i = 0; i<15; i++) {
    //     printf("fatorial de %d = %.0f\n", i, fatorial(i));
    // }
    // return 0;
    for (int i=1; i<40; i++)
        printf("fibonacci em %d = %d\n", i,fib(i));
    return 0;
}