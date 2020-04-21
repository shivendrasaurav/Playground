#include<iostream>
using namespace std;
int main()
{
  float a, i, sum=95;
  cin>>a;
  for(i=0; i<a; i++){
    cout<<sum<<" ";
    sum = sum + 20.5 + i*2;
  }
}