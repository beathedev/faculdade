#include<stdio.h>
#include<conio.h>

int Quick(int vetor[4], int inicio, int fim){
   
   int pivo, aux, i, j, meio,a;
   
   i = inicio; // armazena primeira posição
   j = fim; // armazena ultima posiçao
   
   meio = (i + j) / 2; // encontra o meio
   pivo = vetor[meio];// pivo utilizado para comparar
   
   
   while(j > i){ 
		
		// verifica a se posiçao i é menor que pivo 
	  while (vetor[i] < pivo)i = i + 1; 	// se for, incrementa, andando mais uma casa até que encontre um valor maior que o pivo
	   // verifica a se posiçao j é maior que pivo
      while (vetor[j] > pivo) j = j - 1; 	// se for, decrementa, descendo mais uma casa até que encontre um valor menor que o pivo 
      
       /* Após o i encontrar um valor maior que o pivo e o j encontrar um valor menor, eles são trocados*/
      if(i <= j){ 
         aux = vetor[i]; // Armazena o valor maior
         vetor[i] = vetor[j]; // Recebe o valor menor
         vetor[j] = aux; // Recebe o valor maior
         i = i + 1;  
         j = j - 1; 
         // iguala os valores pra sair do loop
      }
   }
   // chama recursividade
   if(inicio < j) Quick(vetor, inicio, j);
   if(i < fim)Quick(vetor, i, fim);
   

}


main(){
   
   //int vetor[10] = {7, 9, 4, 3, 6, 1, 18, 2, 10, 5};
   int vetor[4] = {3,8,5,1};
   
   int i;   
   printf("Vetor desordenado:\n");
   for(i = 0; i < 4; i++){
      printf("%d ", vetor[i]);
   }
   printf("\n");   
   
   Quick(vetor, 0, 4);
   
   printf("Vetor ordenado:\n");
   for(i = 0; i < 4; i++){
      printf("%d ", vetor[i]);
   }
   printf("\n"); 
   getch();  
}


