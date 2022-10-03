#include <stdio.h>

int main(){
    float int1;
    float int2;
    scanf("%f %f", &int1, &int2);
    for(int i = 1;;++i){
        float first = (float)i/int1;
        float second = int2-1;
        if(first>second){
            printf("%d",i);
            break;
        }
    }
}