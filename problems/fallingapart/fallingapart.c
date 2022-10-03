#include <stdio.h>
#include <stdbool.h>
int main(){
    int player1 = 0;
    int player2 = 0;
    int cycle;
    int condition = 0;
    bool check = true;
    scanf("%d",&cycle);
    int array[cycle];
    for(int i = 0; i<cycle; ++i){
        scanf("%d",&array[i]);
    }
    while(check){
        int max = 0;
        int index = 0;
        for(int i = 0; i<cycle; ++i){
            if(array[i]>max){
                max = array[i];
                index = i;
            }
        }
        array[index] = 0;
        if(max == 0){
            check = false;
            break;
        }
        if(condition%2 == 0)
            player1 += max;
        else
            player2 +=max;
        ++condition;
    }
    printf("%d %d",player1,player2);
}
