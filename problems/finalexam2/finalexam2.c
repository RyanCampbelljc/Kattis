#include <stdio.h> 

int main(){
    unsigned int cycle;
    scanf("%u",&cycle);
    char array[cycle];
    for(int i = 0; i < cycle; ++i){
        char temp;
        scanf("%c",&temp);
        if(temp == '\n'){
            --i;
            continue;
        }
        array[i] = temp;
    }
    int correct = 0;
    for(int i = 0; i < cycle-1; ++i){
        if(array[i] == array[i+1]){
            ++correct;
        }
    }
    printf("%d\n",correct);
}
