#include <stdio.h>
#include <stdbool.h>

int sumDigits(int num){
    int sum = 0;
    while(num > 0){
        sum += num%10;
        num /=10;
    }
    return sum;
}


int main(){
    int input;
    scanf("%d",&input);
    while(input != 0){
        int sum = sumDigits(input);

        int i = 11;
        while(true){
            int product = i * input;
            int digitSum = sumDigits(product);
            if(digitSum == sum){
                printf("%d\n",i);
                break;
            }
            ++i;
        }




        scanf("%d",&input);
    }
}
