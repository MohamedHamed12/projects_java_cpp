#ifndef PATIENT_H
#define PATIENT_H
#pragma once
#include<iostream>
#include <string>
#include "hospital.h"
#include <vector>
using namespace std;
class patient:public hospital
{
public:
    string PatientName,patientContact;
    int id,patientEexenditure;
    void printPatient(vector<patient>&p,vector<hospital>&h);
   
};

#endif