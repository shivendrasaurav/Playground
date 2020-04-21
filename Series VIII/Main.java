#include<iostream>
using namespace std;
int main()
{
  int a, i, sum=4;
  cin>>a;
  for(i=1; i<=a; i++){
    cout<<sum<<" ";
    sum = sum + i*i;
  }
}