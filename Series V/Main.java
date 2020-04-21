#include<iostream>
using namespace std;
int main()
{
  int a, i, num = 11;
  cin>>a;
  for(i=1; i<=a; i++){
    cout<<num*num<<" ";
    num = num + 4;
  }
}