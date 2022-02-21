#include "patient.h"
#include "hospital.h"
#include <vector>


void patient::printPatient(vector<patient>&p,vector<hospital>&h)
{
     cout << "PRINT patients DATA:"
         << endl;
    cout << "Patient_Name     "
         << "Patient_Id     "
         << "Patient_Contact     "
         << "Alloted_Hospital     "
         << "Patient_Expenditure     \n";
    for(auto i:p)
    {
      
         cout << i.PatientName
             << "      "
             << "          "
             << i.id
             << "              "
             << "          "
             << i.patientContact
             << "                   "
             << i.hosName
             << "                   "
             << i.priceBed
             << "            "
             << endl;
    
    }
    
    cout << endl
         << endl;
}
