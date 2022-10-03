#include <stdio.h>
#include <math.h>

int squared(int n){
    int sum = 0;
    for(int i = 1; i <= n; i+=2){
        sum += pow(i,2);
    }
    return sum;
}

int main(){
    int input;
    scanf("%d",&input);
    int count = 0;
    for(int i = 1; i <= input; i+=2){
        ++count;
        if(squared(i)>input){
            --count;
            break;
        }
    }
    printf("%d\n",count);
}
