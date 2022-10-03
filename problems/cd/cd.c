#include <stdio.h>
#include <stdlib.h>
int main(){
    int numCDJack;
    int numCDJill;
    int count = 0;
    scanf("%d %d", &numCDJack, &numCDJill);
    while(numCDJack !=0 && numCDJill !=0){
        int* jackArray = (int*)malloc(numCDJack*sizeof(int));
        int* jillArray = (int*)malloc(numCDJill*sizeof(int));
        for(int i = 0; i< numCDJack; ++i){
            scanf("%d",&jackArray[i]);
        }
        for(int i = 0; i< numCDJill; ++i){
            scanf("%d",&jillArray[i]);
        }


        for(int i = 0; i< numCDJack; ++i){
            while()
        }

            for(int k = 0; k< numCDJill; ++k){
                if(jackArray[i] == jillArray[k]){
                    ++count;
                    break;
                }
            }
        
        free(jackArray);
        free(jillArray);
        printf("%d",count);
        scanf("%d %d", &numCDJack, &numCDJill);
    }


}

