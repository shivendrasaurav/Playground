#include<iostream>
using namespace std;
int main()
{
  float a, b, c, d, vol;
  cin>>a>>b>>c>>d;
  vol = 3.14 * a * a * b;
  if(vol < c*d)
    cout<<"The tank can be filled within "<<d<<" hours";
  else
    cout<<"The tank cannot be filled within "<<d<<" hours";    
}