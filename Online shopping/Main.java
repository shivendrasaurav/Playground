#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d, e, f, g, h, i, fk, sd, am;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  fk = a - (a*b/100) + c;
  cout<<"In Flipkart Rs."<<fk<<endl;
  sd = d - (d*e/100) + f;
  cout<<"In Snapdeal Rs."<<sd<<endl;
  am = g  - (g*h/100) + i;
  cout<<"In Amazon Rs."<<am<<endl;
  if(fk <= sd && fk < am)
    cout<<"He will prefer Flipkart";
  else if(sd <= fk & sd < am)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}