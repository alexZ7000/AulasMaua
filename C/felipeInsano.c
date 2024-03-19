#include <stdio.h>

int soma(int a, int b) {
    return a + b;
}

int subtrai(int a, int b) {
    return a - b;
}

int main(){
    int (*operacao)(int, int);
    //vetor é a mesma coisa que um ponteiro
    char sla[9] = "Alessandro";
    void *p = sla;
    printf("%s\n", p);
    operacao = &subtrai;
    printf("%i", operacao(2, 3));
}