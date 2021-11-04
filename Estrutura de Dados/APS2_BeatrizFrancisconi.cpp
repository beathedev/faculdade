/*
Aluna: Beatriz de Carvalho Francisconi
Matrícula: 20102624
Construa um sistema para um hospital que está começando um programa de incentivo a doação de sangue, o objetivo do sistema é registrar e gerenciar informações dos doadores.
O sistema terá as seguintes funções:
- Registrar um novo doador com nome, cpf, idade e tipo sanguíneo.
- Editar algum registro.
- Buscar um doador pelo CPF.
- Listar todos os doadores. 
*/
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#include <string.h>

typedef struct PACIENTE{
	int cpf;
    char nome[200];
    int idade;
    char tipo_sanguineo[4]; 
	struct PACIENTE *proximo;
}LISTA;

typedef LISTA *REG;

REG doador = NULL;

REG criaNovoDoador(int cpf, int idade, char nome[200], char tipo_sanguineo[4]){
	REG novoDoador = (REG)malloc(sizeof(LISTA));
	novoDoador->cpf = cpf;
	novoDoador->idade = idade;
    strcpy(novoDoador->nome,nome);
    strcpy(novoDoador->tipo_sanguineo,tipo_sanguineo);
	novoDoador->proximo = NULL;
	return(novoDoador);
}

REG armazenaDoador(REG Lista, REG doador){
	if(Lista == NULL) return (doador);
	else
		Lista->proximo = armazenaDoador(Lista->proximo, doador);
		return Lista;
}

REG verificaDoador(int dado, REG doador){
	if(doador == NULL) return(NULL);
	if(doador->cpf == dado) return(doador);
	else
	
	return(verificaDoador(dado, doador->proximo));
}

void telaCadastro(){
	system("cls");
	int cpf, idade;
	char nome[200], tipo_sanguineo[4];
	printf("-------- Cadastro de Doadores --------");
		do{
			printf("\n*Digite 0 para sair.");
			printf("\nDigite o CPF do Doador:");
			scanf("%d",&cpf);
				if(cpf == 0){
				break;
				}else{
					REG valorExiste = verificaDoador(cpf, doador);
					if(valorExiste == NULL){
					printf("\nDigite o nome do Doador:");
					scanf("%s",&nome);
					printf("\nDigite a idade do Doador:");
					scanf("%d",&idade);
					printf("\nDigite o tipo sanguíneo do Doador:", idade);	
					scanf("%s",&tipo_sanguineo);
					REG ListaCadastro = criaNovoDoador(cpf,idade,nome,tipo_sanguineo);						
					doador = armazenaDoador(ListaCadastro, doador);
					telaCadastro();
					break;
					}else{
						printf("CPF já registrado.\n");
						system("pause");
						break;
					}
				}
			
		}while(cpf!=0);
}


void buscarDoador(){
	int cpf;
	system("cls");
	printf(" --- Buscar Doador ---\n");
	printf("Digite o CPF que deseja localizar: ");
	scanf("%d",&cpf);
	REG valorExiste = verificaDoador(cpf, doador);
	while(cpf != 0){
	system("cls");
			if(valorExiste == NULL){
				printf("CPF não cadastrado.\n");
				system("pause");
				buscarDoador();
			}else{	
				printf(" -- Informações do Doador -- \n");								
				printf("Memória: %p \n", valorExiste);
				printf("CPF: %d \n", cpf);
			    printf("Nome: %s \n", valorExiste->nome);
				printf("Idade: %d  \n", valorExiste->idade);
				printf("Tipo sanguineo: %s  \n", valorExiste->tipo_sanguineo);
				//system("pause");
				getchar();getchar();
				}
				break;
			}
	}

void editarDoador(){
	int cpf,idade;
	char nome[200], tipo_sanguineo[4];
	system("cls");
	printf(" --- Editar Doador ---");
	printf("\nInsira o CPF:");
	scanf("%d",&cpf);
	REG valorExiste = verificaDoador(cpf, doador);
	while(cpf != 0){
		system("cls");
		if(valorExiste->cpf == NULL){
		printf("CPF não cadastrado!\n");
		//system("pause");
		getchar();getchar();
			}else{
				printf(" -- Informações do Doador -- \n");				
				printf("Mémoria: %p \n", valorExiste);
				printf("CPF: %d \n", valorExiste->cpf);
			    printf("Nome: %s  \n", valorExiste->nome);
				printf("Idade: %d  \n", valorExiste->idade);
				printf("Tipo Sanguíneo: %s  \n", valorExiste->tipo_sanguineo);
				printf("\n\n -- Insira Novos Valores -- ");				
				printf("\nNome:");
				scanf("%s",&nome);
				printf("\nIdade: ");
				scanf("%d",&idade);
				printf("\nTipo Sanguíneo: ");
				scanf("%s",&tipo_sanguineo);							
				//system("pause");
				while (doador != NULL){
					if(doador->cpf == cpf){
				strcpy(doador->nome,nome);
    			strcpy(doador->tipo_sanguineo,tipo_sanguineo);
				doador->idade = idade;
				break;
				}
				doador = doador->proximo;				
				}
				system("pause");

			}
				break;
		}		
	}
void telaListar(REG Lista){
				system("cls");
				printf(" -- Lista dos Doadores -- \n");				
				while (Lista != NULL)
		    	{
		    	printf("|||||||||||||||||||||||||\n|");
		       	printf("Memória: %p \n", Lista);
				printf("CPF: %d \n", Lista->cpf);
			    printf("Nome: %s \n", Lista->nome);
				printf("Idade: %d  \n", Lista->idade);
				printf("Tipo sanguineo: %s  \n", Lista->tipo_sanguineo);
				Lista = Lista->proximo;
				}
		    	getchar();	getchar();
}

int main(){
	setlocale(LC_ALL, "Portuguese");
	int opcao;
	do{
	system("cls");
		printf("	---------- Sistema Hospital --------- \n\n");
		printf("	  ~Gerenciamento de Pacientes~ \n\n");
		printf("1 - Registrar Doador \n");
		printf("2 -  Buscar Doador \n");
		printf("3 -  Alterar Doador \n");
		printf("4 -  Ver Lista de Doadores \n");
		printf("0 -  Sair\n");
		printf("Selecione uma opção:");
		scanf("%d",&opcao);
		switch(opcao){
			case 1:
				telaCadastro();
			break;
			case 2:
				buscarDoador();
			break;
			case 3:
				editarDoador();
			break;
			case 4:
				telaListar(doador);
			break;
		}
	}while(opcao!=0);
	return 0;
	
}
