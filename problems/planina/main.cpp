#include <iostream>
#include <cmath>

int main(){
    int num;
    std::cin >> num;
    std::cout << (int)pow((pow(2,num)+1),2);
    return 0;
}
