#include <stdio.h>
#include <conio.h>
int i;
int sequencial( int vet[7], int valor){
		i=0;
		for(i=0;i<7;i++){
		if(vet[i] == valor){
			printf("Valor encontrado na posiçao vet[%d] = %d",i, valor);
			
		}
	}
}
main(){
	int vet[7]={9,7,8,1,2,0,4}, valor;
	printf("Qual valor deseja achar?");
	scanf("%d",&valor);
	sequencial(vet, valor);
	
	
	
}
