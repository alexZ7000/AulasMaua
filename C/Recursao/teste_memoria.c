#include <stdio.h>
#include <stdlib.h>

int main(){
    int v[100];
    int *p; // o ponteiro não importa o tipo ele sempre vai ter o mesmo tamanho
    void *p2; // void significa que ele não tem retorno, significa que ele é null
    // casting = converter temporariamente(no processador) um tipo de dado para outro tipo

    p = malloc(10000 * sizeof(int));
    while (p != NULL) {
        p = (int *) malloc (1000000 * sizeof(int));
        printf ("%p\n", p);
        free(p);
    }
    printf("O tamanho do v: %llu bytes\n", sizeof(v));
    printf("O tamanho do p: %llu bytes\n", sizeof(p));
    printf("O tamanho do p2: %llu bytes\n", sizeof(p2));
    return 0;
}