#include <stdio.h>
int main(){
    int h,w,sh,sw;
    scanf("%d %d %d %d",&h,&w,&sh,&sw);
    if(sh<=h-2 && sw<=w-2){
        puts("1");
    }
    else{
        puts("0");
    }

} 
