#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  float a, b, c;
  cin>>a>>b;
  c = a/12;
  if(b < c)
    cout<<"Loss : Rs."<<c*12 - b*12;
  else if(c < b)
    cout<<"Profit : Rs."<<b*12 - c*12;
  else
    cout<<"No profit nor loss";
}