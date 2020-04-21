#include<iostream>
using namespace std;
int main()
{
  int a, b, c;
  cin>>a>>b>>c;
  if((a*b)%c==1 || ((a+b)*10)%c==1)
    cout<<"Yes";
  else
    cout<<"No";
}