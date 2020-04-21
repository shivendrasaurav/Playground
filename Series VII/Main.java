#include<iostream>
using namespace std;
int main()
{
  int i;
  float a, sum=1;
  cin>>a;
  for(i=1; i<=a; i++){
    cout<<sum<<" ";
    if(i%2==0)
      sum = sum*(1.5);
    else
     sum = sum*(2);
     
  }
}