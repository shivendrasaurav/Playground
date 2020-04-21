#include<iostream>
using namespace std;

int fib(int a){
  if(a<=1)
    return a;
  else
    return (fib(a-1) + fib(a-2));
}

int main()
{
  int a, i, term;
  cin>>a;
  term = fib(a-1);
  cout<<"Enter the value of n \nThe term "<<a<<" in the fibonacci series is "<<term;
}