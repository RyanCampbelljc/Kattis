#include <stdio.h>

int main(){
    int cycle;
    scanf("%d",&cycle);
    for(int i = 0; i < cycle; ++i){
        int dataset;
        int num;
        scanf("%d %d",&dataset,&num);
        int sum = num;
        for(int k = 1; k <= num; ++k){
            sum += k;
        }
        printf("%d %d\n", dataset, sum);
    }
}
