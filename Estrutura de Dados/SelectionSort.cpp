#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
// se guiar pela imagem salva na pasta
int i, vet[7], min, x, aux,y;
int n = 0;
main(){
	
	   printf("\n\nVetor Desorganizado: ");
       
       for(i=0;i<7;i++){
           printf("insira:");
           scanf("%d",&vet[i]);
        }  
        
        
		for(i= 0; i < 7; i++){
			min = i; // armazena posi�ao minima
				for(x = i +1; x < 7; x++){ // percorre o vetor inteiro acima da posi��o i
					if( vet[x] < vet[min]){ // se algum valor for menor que a posi�ao i, ele entra nessa condi�ao
						min = x;	//guarda a posi�ao do novo valor minimo
						}
						aux = vet[i]; // guarda o valor da posi�ao i
						vet[i] = vet[min]; // posi�ao i recebe o novo valor minimo
						vet[min] = aux; //  posi�ao min(no caso � a posi�ao do x) recebe o valor do aux( que no caso � o antigo valor da posi�ao i)
						/* ou seja, nessa troca inteira de valores o que basicamente acontece � que o vet[i] recebe o valor menor 
						e o vet[min] recebe o valor que era maior que o menor */
						
			
				}	
		}
	  

		
	
	
       printf("\n\nVetor Organizado: ");
       
     for(i=0;i<7;i++){
           printf("%d, ", vet[i]);
       }   
	

		//	printf("Valor encontrado na posicao vet[%d] = %d",meio, valor);
		
	
}
