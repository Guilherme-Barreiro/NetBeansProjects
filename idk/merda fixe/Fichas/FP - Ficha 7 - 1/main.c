#include <stdio.h>
#include <stdlib.h>
#define MAX_NOME_ALUNO 20
#define MAX_ALUNOS 30

typedef struct{
    int ano, mes, dia;
} Data;

typedef struct{
    int numero;
    char nome[MAX_NOME_ALUNO];
    Data data_nascimento;
} Aluno;

typedef struct{
    int contador;
    Aluno alunos[MAX_ALUNOS];
} Alunos;

int get_int(int num) {
    int n;
    printf("Introduza o %dº valor: ", num);
    scanf("%d", &n);
    return n;
}
void get_string(const char *frase, char *string, int max_char) {
    printf("%s: ", frase);
    fgets(string, max_char, stdin);
    size_t len = strlen(string);
    if (len > 0 && string[len - 1] == '\n') {
        string[len - 1] = '\0';
    }
}

void print_menu(){
    printf("\n\t1 - Inserir aluno\n\t2 - Consultar alunos ");
}

int inserirAluno(){
    char nome[MAX_NOME_ALUNO]
    get_string();
}
void consultarAlunos(){}
int main() {
    int opcao = 0;
    print_menu();
    scanf("%d", &opcao);
    switch(opcao){
        case 1:
            inserirAluno();
            break;
        case 2:
            consultarAlunos();
            break;
        default:
            main();            
    }
    return 0;
}

