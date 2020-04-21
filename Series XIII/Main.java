#include<iostream>
using namespace std;
int main()
{
  int a, i, sum=5;
  cin>>a;
  for(i=1; i<=2*a; i++){
    if(i%2!=0){
      cout<<sum<<" ";
      sum = sum + i*11;
    }
  }
}