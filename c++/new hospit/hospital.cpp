#include "hospital.h"
#include <algorithm>
#include <vector>

void hospital::printHos(vector<hospital>&h)
    {
         cout << "PRINT hospitals DATA:"
         << endl;
  
    cout << "HospitalName     "
         << "     Location     "
         << "Beds_Available     "
         << "         Rating     "
         << "Hospital_Contact     "
         << "Doctor_Name     "
         << "             Price_Per_Bed     \n";
         for(int i =0;i<h.size();i++)
         {
           cout << h[i].hosName
             << "                 "
             << "    "
             << h[i].location
             << "           "
             << h[i].bedAvailble
             << "                    "
             << h[i].rating
             << "            "
             << h[i].hosContact
             << "             "
             << h[i].docName
             << "                  "
             << "    "
             << h[i].priceBed
             << "            "
             << endl;
         }
         
         cout << endl
         << endl;
     //     m
    }
bool hospital::name(hospital& A,hospital& B )
{
  return A.hosName>B.hosName;
}
void hospital::sortByName(vector<hospital>h4)
{
  int n;
cout<<"do you want it  "<<endl;
cout<<"1-Ascending                 2-Descending "<<endl;
  cin>>n;

   if (n==1)  sort(h4.begin(),h4.end(),[](hospital& A,hospital& B){return  A.hosName<B.hosName;});
   else if (n==2) sort(h4.begin(),h4.end(),[](hospital& A,hospital& B){return  A.hosName>B.hosName;});
  
    cout << "SORT BY NAME:";
    if (n==1) cout<<"1-Ascending "<<endl;
    else if(n==2)cout<<"1-Descending "<<endl;;
    
        cout << endl
         << endl;
   printHos(h4);
}
