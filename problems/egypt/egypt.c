#include <stdio.h>
#define _USE_MATH_DEFINES
#include <math.h>
int main(){
    int a, b, c;
    scanf("%d %d %d",&a,&b,&c);
    while(a != 0 || b !=0 || c != 0){
        if(a>b && a>c){
            int temp = c;
            c = a;
            a = temp;
        }
        else if (b>a && b>c){
            int temp = c;
            c = b;
            b = temp;
        }

        if(a*a + b*b == c*c){
            puts("right");
        }
        else{
            puts("wrong");
        }
        scanf("%d %d %d",&a,&b,&c);
    }
}
        


