#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  float a, i, sum = 0.5;
  cin>>a;
  for(i=1; i<=a; i++){
    cout<<sum<<" ";
    sum = sum + pow(3, i-1);
  }
}