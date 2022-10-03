#include <iostream>
#include <unordered_set>
int main(){
    int cycle;
    std::cin >> cycle;
    std::unordered_set<int> array;

    for(int i = 0; i < cycle; ++i){
        int temp, temp2;
        std::cin >> temp >> temp2;
        for(int j = temp; j <= temp2; ++j){
            array.insert(j);
        }
        
    }
    std::cout << array.size();
    return 0;
}
