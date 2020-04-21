#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a, i, prod = 3;
  cin>>a;
  for(i=1; i<=a; i++){
    cout<<prod<<" ";
    prod = prod * 3;
  }
}