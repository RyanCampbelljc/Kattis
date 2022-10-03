#include <stdio.h>
#include <stdlib.h> 
int main(){
    int numCompanys, numRequests;
    scanf("%d %d",&numCompanys,&numRequests);
    //printf("comp and req %d %d\n",numCompanys,numRequests);
    int companyArray[numCompanys];
    for(int i = 0; i < numCompanys; ++i){
        int temp;
        scanf("%d",&temp);
        companyArray[i] = temp;
    }

    for(int i = 0; i < numRequests; ++i){
        int requestType, a, b;
        scanf("%d %d %d",&requestType,&a,&b);
        

        if(requestType == 1){
            companyArray[a-1] = b;
        }
        else{
            int anwser = abs(companyArray[b-1] - companyArray[a-1]);
            printf("%d\n",anwser);
        }

    }
}