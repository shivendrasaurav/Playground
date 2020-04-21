#include<iostream>
using namespace std;

int tobin(int a){
  if(a==0)
    return 0;
  else
    return (a % 2 + 10 * tobin(a / 2));
}

int main()
{
  int a, b;
  cin>>a;
  b=tobin(a);
  cout<<b;
}