#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  if(a==1)
    cout<<b;
  else if(a==2)
    cout<<b+b*50/100;
  else if(a==3)
    cout<<b+b;
  else
    cout<<"Number of items is more";
}