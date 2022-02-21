#ifndef HOSPITAL_H
#define HOSPITAL_H
#include<iostream>
#include <string>
#include <vector>
using namespace std;

#pragma once

class hospital
{
public:
    string hosName;
    string location;
    string docName;
    string hosContact;
    float rating;
    int bedAvailble;
    int distanceCenter;
    int priceBed;
    
    void printHos(vector<hospital>&h);
    bool name(hospital& A,hospital& B );
    void sortByName(vector<hospital>h4);

};

#endif