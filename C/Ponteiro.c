#include<stdio.h>
int main () {
    int a = 231;
    void *pd; // ponteiro direto
    void **pi; // ponteiro indireto, equivale a int *(*p) pd = &a; // pd recebeo endereço de um int pi= &pd; // pi recebeo endereço de um ponteiro para int
    printf("a está em %p e vale %d\n", &a, a);
    printf("pd está em %p e vale %p\n",&pd, pd);
    printf("pi está em %p e vale %p\n", &pi, pi);
    printf("*pd vale %d\n",*pd);
    printf("*pi vale%p\n", *pi);
    printf("**pi vale %d\n", **pi);
    return 0;
}