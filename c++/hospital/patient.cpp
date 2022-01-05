#include "patient.hpp"  
#include <string>
#include <iostream>
using namespace std;
    patient::patient()
    {
        
    }
        
        bool patient::exit()
        {
            return e;
        }
        void patient::filldata ()
                {
                    for (int i = 0; i < 9; i++)
                    {
                        cout<<"please enter (";
                        cout<<b[i]<<") =>"<<endl;
                        cin>>a[r][i];
                    }
                        r+=1;
                }
        void patient::outputdata()
                {
                        for (int i = 0; i < r; i++)
                    {
                            for (int j = 0; j < 9; j++)
                        {
                            cout<<a[i][j]<<" ";
                        }
                    cout<<endl;

                    }
                }
        int  patient::choose()
        {

            cout<<"o Press  1 => to fill data of patient         "<<endl;
            cout<<"o Press  2 => to output data in the database"<<endl;
            cout<<"o Press  3 => to search on patient by First Name        "<<endl;
            cout<<"o Press  4 => to search on patient that pay more than 200 L.E "<<endl;
            cout<<"o Press  5 => to search on patient with doctor (Ahmed Hossam)    "<<endl; 
            cout<<"o Press  6 => to search on patient by ID "<<endl;
            cout<<"o Press  7 => to search on patient that spent 5 days in hospital    "<<endl;
            cout<<"o Press  8 => to search if there is patient spent 0 days on hospital "<<endl;
            cout<<"o Press  9 => to exit a chosse"<<endl;

            int n;
            cin>>n;
            switch (n)
            {
            case 1:
            patient::filldata();
            
            break;
            case 2:
            
            patient::outputdata();
            break;
            case 3:
            // patientt::searchonpatient();
            break;
        
            break;
            case 9:
            cout<<"the programm finish"<<endl;
            e=false;
            break;

            default:
            cout<<"you doesnot chose right n"<<endl;
            break;
            }
            return n;
        }
    patient::~patient()
{
	
}