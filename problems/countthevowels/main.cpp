#include <string>
#include <iostream>
int main(){
    std::string str;
    std::getline(std::cin,str);
    int sum = 0;
    for(char c : str){ 
        if(c == 'a' || c == 'A')
            ++sum;
        else if(c == 'e' || c == 'E')
            ++sum;
        else if(c == 'i' || c == 'I')
            ++sum;
        else if(c == 'o' || c == 'O')
            ++sum;
        else if(c == 'u' || c == 'U')
            ++sum;
        
    }
    std::cout << sum << "\n";//std::endl to also flush buffer
    return 0;
}
