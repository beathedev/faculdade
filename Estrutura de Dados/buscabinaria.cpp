#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

int i, vet[7]={20,35,44,70,86,90,106}, valor, direita, esquerda, meio;
int n = 7;
main(){
	printf("Qual valor deseja achar?");
	scanf("%d",&valor);
	direita = n-1; 
	esquerda = 0; 
	
	while(esquerda <= direita){
		meio = (direita + esquerda)/2;
		if(vet[meio] == valor){
			printf("Valor encontrado na posicao vet[%d] = %d",meio, valor);
			break;
		}else if(vet[meio] < valor){ // essa condi��o � pra quando o meio � menor que o valor, ent�o o meio tem que andar mais uma casa
			esquerda = meio + 1; 
		}else{ // essa condi��o � pra quando o meio � maior que o valor, ent�o o meio tem que diminuir mais uma casa
			direita = meio - 1;
		}
	}	
		
		
	
}
