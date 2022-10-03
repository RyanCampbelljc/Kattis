#include <stdio.h>
#include <string.h>
int main(){
    char input1[1001] = {0};
    char input2[1001] = {0};
    scanf("%s %s",input1, input2);
    if(strlen(input1) >= strlen(input2)){
        puts("go");
    }
    else{
        puts("no");
    }
}
