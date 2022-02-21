#include <iostream>
#include <string>
#include <vector>
#include "mange.cpp"
using namespace std;

int main (){
    mange m;

    string pName[] = { "P1", "P2", "P3", "P4" };
    int pId[] = { 2, 3, 4, 1 };
    string pContact[] = { "234534XXX7", "234576XXX2", "857465XXX9","567657XXX0" };
    int Cost[] = { 1000, 1200, 1100, 600 }; 
    string hName[] = { "H1", "H2", "H4", "H3" };
    string locations[] = { "Bangalore", "Bangalore","Mumbai   ", "Prayagraj" };
    int beds[] = { 4, 5, 6, 9 };
    float ratings[] = { 5.2, 4.1, 3.4, 5.9 };
    string hContact[]= { "657534XXX7", "298766XXX2", "324565XXX9","343456XXX4" };
    string dNames[] = { "D1", "D4", "D3", "D2" };
    int prices[] = { 100, 200, 100, 290 };

    m.mangment(4,pName,pId,pContact,Cost,hName,locations,beds,ratings,hContact,dNames,prices);
    m.mainscrean();

    return 0;
}