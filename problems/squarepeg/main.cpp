#include <iostream> 
#include <cmath>

int main(){
    int length, radius;
    std::cin >> length >> radius;
    float anwser = sqrt(2*pow((length/2.0),2));
    if(anwser<radius){
        std::cout << "fits\n";
    }
    else{
        std::cout << "nope\n";
    }
}
