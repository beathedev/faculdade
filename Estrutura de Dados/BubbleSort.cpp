// Aluna: Beatriz de Carvalho Francisconi
// Matrícula: 20102624
#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>
float inicio, fim, tDecorrido1,tDecorrido2;

int vet1[1000], vet2[100000], i, x, y, valor1, valor2, menor, a;
	int GeraVet1(){
		i=0;
		valor1 = 1000 ;
		for(i=0;i<1001;i++){
			vet1[i] = valor1;
			valor1 = valor1 - 1;
		}
	}
	int GeraVet2(){
			a=0;
			valor2 = 100000 ;
			for(a=0;a<100001;a++){
				vet2[a] = valor2;
				valor2 = valor2 - 1;
			}
		}

	int BubbleSort1(){
			inicio = clock();
			for (i = 0; i < 1001; i++) {
				 	menor = vet1[i];
					for(y=i;y<1001;y++){
						if(vet1[y] <= menor){
							menor = vet1[y];
							x = y;
						}	
					}
					vet1[x] = vet1[i];
					vet1[i] = menor;
		}
		
	printf("\n Vetor Organizado de 1000 elementos [");
       
    for(i=0;i<1001;i++){
       printf("\n %d,  ",vet1[i]);
    }   
    printf("]");
	printf("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
	fim = clock();
	tDecorrido1 = ((fim - inicio	) / (CLOCKS_PER_SEC / 1000));
}

int BubbleSort2(){
	inicio = clock();
	for (a = 0; a < 100001; a++) {
		 	menor = vet2[a];
			for(y=a;y<100001;y++){
				if(vet2[y] <= menor){
					menor = vet2[y];
					x = y;
				}	
			}
			vet2[x] = vet2[a];
			vet2[a] = menor;
		}
		
	printf("\n Vetor Organizado de 100000 elementos [", a );
       
    for(a=0;a<100001;a++){
       printf("\n %d,",vet2[a]);
    }   
    printf("]");
	printf("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
	fim = clock();
	tDecorrido2 = ((fim - inicio	) / (CLOCKS_PER_SEC / 1000));

}

int main(){
	GeraVet1();
	BubbleSort1();
	GeraVet2();
	BubbleSort2();
	printf("\n Tempo 1: %.2fs", tDecorrido1/1000);
	printf("\n Tempo 2: %.2fs", tDecorrido2/1000);
	// provavelmente remover bubblesort da funçao depois	
	



	
}
