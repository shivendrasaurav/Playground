#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int a, i, sum = 1;
  cin>>a;
  for(i=1; i<=a; i++){
    if(i%2!=0)
      sum = pow(i, 2)-1;
    else
      sum = pow(i, 2)-2;
    cout<<sum<<" ";
  }
}