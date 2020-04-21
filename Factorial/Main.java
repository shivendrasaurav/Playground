#include<iostream>
using namespace std;

int fact(int a){
  int i, p=1;
  for(i=1; i<=a; i++)
    p=p*i;
  cout<<"Enter the value of n\nThe factorial of "<<a<<" is "<<p;
}

int main()
{
  int a;
  cin>>a;
  fact(a);
}