#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a, b;
  cin>>a;
  b = floor((1 / sqrt(a))*a) + 1 ;
  cout<<a+b;
}