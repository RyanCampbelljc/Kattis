#include <iostream>

int main(){
    int num, num2;
    std::cin >> num >> num2;
    if(num == 0 && num2 == 0)
        std::cout << "Not a moose\n";
    else{
        if(num == num2)
            std::cout << "Even " << (2*num);
        else
            std::cout << "Odd " << ((num>num2)? (2*num) : (2*num2));
    }
}
