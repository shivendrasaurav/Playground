#include<iostream>
using namespace std;

int prime(int a){
  int i, flag;
  for(i=2; i<a/2; i++){
    if(a%i==0)
      flag=1;
  }
  return flag;
}

int main()
{
  int a, flag=0, i;
  cin>>a;
  flag=prime(a);
  if(flag==0)
    cout<<"Prime Number";
  else
    cout<<"Not a Prime Number";
}