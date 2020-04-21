#include<iostream>
using namespace std;

int power(int a, int b){
  if(b==0)
    return 1;
  else if(b==1)
    return a*b;
  else
    return a*(power(a, b-1));
}

int main()
{
  int a, b, op;
  cin>>a>>b;
  op=power(a, b);
  cout<<"Enter the value of a\nEnter the value of n\n";
  cout<<"The value of "<<a<<" power "<<b<<" is "<<op;
}