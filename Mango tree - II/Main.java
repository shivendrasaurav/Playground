#include<iostream>
using namespace std;
int main()
{
  int a, b, c;
  cin>>a>>b>>c;
  if((a*b)%c==1 || c > (a*b)-a && c<a*b)
    cout<<"Yes";
  else
    cout<<"No";
}