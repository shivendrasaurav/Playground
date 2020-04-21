#include<iostream>
using namespace std;

int GCD(int n1, int n2){
  if (n2 != 0)
    return GCD(n2, n1%n2);
  else
    return n1;
}

int main()
{
  int a, b, gcd;
  cin>>a>>b;
  gcd = GCD(a, b);
  cout<<"Enter two positive integers\nG.C.D of "<<a<<" and "<<b<<" = "<<gcd;
  
}