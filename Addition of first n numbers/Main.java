#include<iostream>
using namespace std;

int main()
{
  int n, i=0, sum=0;
  cin>>n;
  while(i!=n+1){
    sum = sum+i;
    i++;
  }
  cout<<sum;
}