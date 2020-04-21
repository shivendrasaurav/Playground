#include<iostream>
using namespace std;
int main()
{
  int a, b = 0, c = 1, i, sum = 0;
  cin>>a;
  for(i=0; i<a-1; i++){
    sum = b + c;
    b = c;
    c = sum;
  }
  cout<<b;
}