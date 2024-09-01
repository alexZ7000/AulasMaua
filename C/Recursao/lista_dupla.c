#include <stdio.h>
#include <stdlib.h>

typedef struct no {
    int info;
    struct no * anterior;
    struct no * proximo;
} t_no;

typedef struct  lista {
    t_no *primeiro;
    t_no *ultimo;
} t_lista;

t_no * constroi_no(int info) {
    t_no  * no = (t_no *) malloc(sizeof(t_no));
    if (no != NULL) {
        no->info = info;
        no->anterior = NULL;
        no->proximo = NULL;
    }
    return no;
}

void inicia_lista(t_lista *l){
    l->primeiro = NULL;
    l->ultimo = NULL;
}

int esta_vazia(t_lista *l){
    return l->primeiro == NULL;
}

void insere_inicio(int info, t_lista *l) {
    t_no  *novo = constroi_no(info);
    if (esta_vazia(l)){
        l->ultimo = novo;
    }
    else {
        novo->proximo = l->primeiro;
        l->primeiro->anterior = novo;
    }
    l->primeiro = novo;
}

void exibe_lista(t_lista *l) {
    if (esta_vazia(l)){
        printf("Lista vazia\n");
    }
    else{
        t_no *aux = l->primeiro;
        while(aux != NULL){
            printf("endereco: %p, valor: %d\n", aux, aux->info);
            aux = aux->proximo;
        }
    }
}

int remove_inicio(t_lista *l) {
    if (esta_vazia(l)) return -1;
    int info = l->primeiro->info;
    t_no *lixo = l->primeiro;
    l->primeiro = l->primeiro->proximo;
    if(l->primeiro == NULL){
        l->ultimo = NULL;
    }
    else{
        l->primeiro->anterior = NULL;
    }
    free(lixo);
    return info;
}

int main(){
    struct no * no1;
    t_no * no2;
    no1 = constroi_no(10);
    no1 = constroi_no(20);
    t_lista lista;
    printf("primeiro: %p\n", lista.primeiro);
    printf("ultimo: %p\n", lista.ultimo);
    inicia_lista(&lista);
    printf("primeiro depois: %p\n", lista.primeiro);
    printf("ultimo depois: %p\n", lista.ultimo);

    insere_inicio(10, &lista); // & = operador referência, é responsável por guardar o endereço de memória da variável, e ele mostra o enderço de memória da variável para o ponteiro
    insere_inicio(20, &lista);
    insere_inicio(30, &lista);
    exibe_lista(&lista);
    printf("%d foi removido do inicio\n", remove_inicio(&lista));
    exibe_lista(&lista);
    return 0;
}