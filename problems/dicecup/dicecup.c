#include <stdio.h>

int main(){
    int di1;
    int di2;
    scanf("%d %d", &di1, &di2);

    int array[di1+di2 + 1];
    for(int i = 0; i <= di1+di2; ++i){
        array[i] = 0;
    }

    for(int i = 1; i <= di1; ++i){
        for(int j = 1; j <= di2; ++j){
            int sum = i+j;
            ++array[sum];
        }
    }

    int max = 0;
    for(int i = 1; i <= di1+di2; ++i){
        if(array[i]>max)
            max = array[i];
    }

    for(int i = 1; i <= di1+di2; ++i){
        if(array[i] == max){
            printf("%d\n",i);
        }
    }
}
