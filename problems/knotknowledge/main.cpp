#include <iostream>
#include <vector>
#include <algorithm>
int main(){
    int cycle;
    std::cin >> cycle;
    std::vector<int> array;
    

    for(int i = 0; i < cycle; ++i){
        int input;
        std::cin >> input;
        array.push_back(input);
    }
    for(int i = 0; i < cycle-1; ++i){
        int input;
        std::cin >> input;
        std::remove(array.begin(),array.end(),input);
    }
    std::cout << array.front();
    
    return 0;
} 
