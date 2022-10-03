#include <stdio.h>
#include <stdbool.h>
int addDigits(int num){
    int sum = 0;
    while(num>0){
        sum += num%10;
        num /=10;
    }
    return sum;
}

int main(){
    int cycle;
    scanf("%d",&cycle);
    for(int i = 0; i < cycle; ++i){
        bool check = true;
        int num;
        scanf("%d",&num);
        int numSumDigits = addDigits(num);
        for(int j = num-1; j>0; --j){
            int jSumDigits = addDigits(j);
            if(jSumDigits == numSumDigits-1){
                printf("%d\n",j);
                check = false;
                break;
            }
        }
        if(check){
            puts("0");
        }
    }
}

