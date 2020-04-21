#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d, e;
  cin>>a>>b>>c>>d>>e;
  if(a*350.34 + b*230.90 + c*190.55 + d*125.30 + e*180.90 < 15000)
    cout<<"Yes";
  else
    cout<<"No";
}