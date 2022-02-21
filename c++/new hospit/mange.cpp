#include "mange.h"
#include "hospital.cpp"
#include "patient.cpp"

vector<hospital>hos;
    vector<patient>pat;
 hospital h;
 patient p;

void  mange::mangment( int n,string pNames[],int pId[],string pContact[],int Cost[],string hName[],
string locations[],int beds[],float ratings[],
string hContact[],string dNames[],int prices[] )
{
    
   

    for (int i=0;i<n;i++)
    {
       
       h.hosName=hName[i];
       h.location=locations[i];
       h.bedAvailble=beds[i];
       h.rating=ratings[i];
       h.hosContact=hContact[i];
       h.docName=dNames[i];
       h.priceBed=prices[i];

       hos.push_back(h);
    }
    for (int i = 0; i < n; i++)
    {
        p.PatientName=pNames[i];
        p.id=pId[i];
        p.patientContact=pContact[i];
        p.priceBed=Cost[i];
        p.hosName=hName[i];
        
        pat.push_back(p);

    }
     cout << endl;

}
void mange::chosse (int n){
   
        switch (n)
        {
        case 1:          
            h.printHos(hos);
             mainscrean();

            break;
        case 2:
         p.printPatient(pat,hos);
                      mainscrean();

        case 3:
        addhos();
                     mainscrean();
        case 4:
         h.sortByName(hos);
          mainscrean();

        default:
            break;
        }
    }
void mange::addhos()
{
  hospital h3;
  cout<< "please enter hostpital name"<<endl;
  cin>> h3.hosName;
  cout<< "please enter hostpital location"<<endl;
  cin>> h3.location;
  cout<< "please enter hostpital bed's availble "<<endl;
  cin>> h3.bedAvailble;
  cout<< "please enter hostpital rating "<<endl;
  cin>> h3.rating;
  cout<< "please enter hostpital contact "<<endl;
  cin>> h3.hosContact;
  cout<< "please enter hostpital doctor names "<<endl;
  cin>> h3.docName;
  cout<< "please enter hostpital bed price "<<endl;
  cin>> h3.priceBed;
  hos.push_back(h3);


}
void mange::addpat()
{
  patient h3;
  cout<< "please enter patient name"<<endl;
  cin>> h3.hosName;
  cout<< "please enter patient location"<<endl;
  cin>> h3.location;
  cout<< "please enter patient bed's availble "<<endl;
  cin>> h3.bedAvailble;
  cout<< "please enter patient rating "<<endl;
  cin>> h3.rating;
  cout<< "please enter patient contact "<<endl;
  cin>> h3.hosContact;
  cout<< "please enter patient doctor names "<<endl;
  cin>> h3.docName;
  cout<< "please enter patient bed price "<<endl;
  cin>> h3.priceBed;
  hos.push_back(h3);


}
void mange::mainscrean()
{
       

    cout<<"         welcome to project hospital"<<endl;
    cout<<"         please chose one of these chosses"<<endl;
    cout<<"***   1-print hospital data              2-print pathant data           "<<endl;
    cout<<"***   3-add data of new hospital         4-print hospital sorted  by name   "<<endl;
    int n;
    cin>>n;
    
    chosse(n);

}
