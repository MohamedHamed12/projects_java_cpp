#include <string>
#include <iostream>
#include "patient.cpp"
using namespace std;
int main()
{
  patient p;
  do
  {
    p.choose();
  } while (p.exit());

  return 0;
}
