#include <stdio.h>
#include <stdbool.h>
bool check = true;
int main(){
    int cycle;
    scanf("%d",&cycle);
    while(cycle-->0){
        char string[256];
        scanf("%255s",&string);
        if(check){
            printf("%s\n",string);
            check = false;
        }
        else{
            check = true;
        }
    }
}