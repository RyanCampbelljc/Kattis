#include <stdio.h>
#include <string.h>
int main(){
    char input[100];
    scanf("%s",input);
    char str1[34] = {0};
    char str2[34] = {0};
    char str3[34] = {0};
    size_t length = strlen(input)/3;
    for(int i = 0; i < length; ++i){
       str1[i] = input[i];
       str2[i] = input[i+length];
       str3[i] = input[i+(length*2)];
    }
    if(strcmp(str1,str2) == 0)
        printf("%s\n",str1);
    else if(strcmp(str1,str3) == 0)
        printf("%s\n",str1);
    else
        printf("%s\n",str2);


} 
