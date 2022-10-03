#include <iostream>
#include <stdio.h>
#include <string>

int main(){
    std::string str;
    std::cin >> str;
    int a = 0;
    int b = 0;
    for(int i = 0; i < str.length(); i+=2){
        if(str.at(i) == 'A'){
            if(str.at(i+1) == '1')
                ++a;
            else
                a+=2;
        }
        else{
            if(str.at(i+1) == '1')
                ++b;
            else
                b+=2;
        }
    }
    std::cout << (a>b? 'A': 'B');
}
