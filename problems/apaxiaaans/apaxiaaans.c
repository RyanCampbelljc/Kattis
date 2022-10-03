#include <stdio.h>

int main(){
    char inputString[251] = {0};
    char finalString[251] = {0};
    scanf("%s",inputString);
    finalString[0] = inputString[0];
    int count = 0;

    for(int i = 1; i < 251; ++i){
        if(inputString[i] != finalString[count]){
            finalString[++count] = inputString[i];
        }
    }
    printf("%s\n",finalString);
}
