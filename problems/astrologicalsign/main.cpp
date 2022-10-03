#include <iostream>
#include <string>

int main(){
    int cycle;
    int day;
    std::cin >> cycle;
    std::string str;
    for(int i = 0; i < cycle; ++i){
        std::cin >> day >> str;
        if(str.compare("Jan") == 0){
            if(day>=21)
                std::cout << "Aquarius\n";
            else{
                std::cout << "Capricorn\n";
            }
        }
        else if(str.compare("Feb") == 0){
            if(day>=20)
                std::cout << "Pisces\n";
            else{
                std::cout << "Aquarius\n";
            }
        }
        else if(str.compare("Mar") == 0){
            if(day>=21)
                std::cout << "Aries\n";
            else{
                std::cout << "Pisces\n";
            }
        }
        else if(str.compare("Apr") == 0){
            if(day>=21)
                std::cout << "Taurus\n";
            else{
                std::cout << "Aries\n";
            }
        }
        else if(str.compare("May") == 0){
            if(day>=21)
                std::cout << "Gemini\n";
            else{
                std::cout << "Taurus\n";
            }
        }

        else if(str.compare("Jun") == 0){
            if(day>=22)
                std::cout << "Cancer\n";
            else{
                std::cout << "Gemini\n";
            }
        }
        else if(str.compare("Jul") == 0){
            if(day>=23)
                std::cout << "Leo\n";
            else{
                std::cout << "Cancer\n";
            }
        }
        else if(str.compare("Aug") == 0){
            if(day>=23)
                std::cout << "Virgo\n";
            else{
                std::cout << "Leo\n";
            }
        }
        else if(str.compare("Sep") == 0){
            if(day>=22)
                std::cout << "Libra\n";
            else{
                std::cout << "Virgo\n";
            }
        }
        else if(str.compare("Oct") == 0){
            if(day>=23)
                std::cout << "Scorpio\n";
            else{
                std::cout << "Libra\n";
            }
        }
        else if(str.compare("Nov") == 0){
            if(day>=23)
                std::cout << "Sagittarius\n";
            else{
                std::cout << "Scorpio\n";
            }
        }
        else if(str.compare("Dec") == 0){
            if(day>=22)
                std::cout << "Capricorn\n";
            else{
                std::cout << "Sagittarius\n";
            }
        }

    }

}
