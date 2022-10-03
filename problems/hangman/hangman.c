#include <stdio.h>
#include <stdbool.h>
#include <string.h>
int main(){
    char input[17] = {0};
    char guess[27] = {0};
    int incorrect = 0;
    int correct = 0;
    scanf("%16s",input);
    scanf("%26s",guess);
    bool isIncorrect = true;
    for(int i = 0; i < 26; ++i){
        isIncorrect = true;
        for(int j = 0; j < 16 && input[j] != 0; ++j){
            if(guess[i] == input[j]){
                isIncorrect = false;
                ++correct;
            }
        }

        if(isIncorrect){
            ++incorrect;
        }
        if(strlen(input) == correct){
            break;
        }

    }


    if(incorrect>=10)
        puts("LOSE");
    else
        puts("WIN");
}
