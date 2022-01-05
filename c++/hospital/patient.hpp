#ifndef PATIENT_H
#define PATIENT_H
#pragma once
#include <string>
#include <iostream>
using namespace std;
class patient  
{
		private:
	    int r=0;
		bool e=true;

		string a[1000][9];
        string b[9]={"firstName","SecondName","LastName","City","StreetNo","ID","payment","doctorname","num_of_days"};

					struct Name
			{
			string firstName,SecondName, LastName;
			};
			struct Address
			{
			string City;
			int StreetNo;
			};

			struct s_patient
			{
			Name name;
			Address address;
			long ID;
			float payment ;
			string doctorname ;
			int num_of_days;
};
	public:
     	patient();
			bool exit();
			void filldata ();
			void outputdata();
			// void searchonpatient();
			int choose();
		~patient();

};
#endif