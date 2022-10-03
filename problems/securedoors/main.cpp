#include <iostream>
#include <unordered_set>
#include <string>
#include <algorithm>
int main(){
   int cycle;
   std::cin >> cycle;
   std::string str;
   std::string name;
   std::unordered_set<std::string> array;
   for(int i = 0; i < cycle; ++i){
      std::cin >> str >> name;
      if(str.compare("entry") == 0){
         if(array.find(name) == array.end()){ // not in array
            array.insert(name);
            std::cout << name << " entered\n";
         }
         else{
            std::cout << name << " entered (ANOMALY)\n";
         }
      }
      else{
         if(array.find(name) != array.end()){ // in array
            std::cout << name << " exited\n";
            array.erase(name);
         }
         else{
            std::cout << name << " exited (ANOMALY)\n";
         }
      }
   } 
} 
