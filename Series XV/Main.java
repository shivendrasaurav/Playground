#include<iostream>
using namespace std;
int main()
{
  int a, i, sum=0, lt=3, now=8;
  cin>>a;
  if(a==1 || a==2)
      cout<<lt<<" "<<now<<" ";
  else{
    for(i=1; i<=a-2; i++){
      if(i==1)
        cout<<lt<<" "<<now<<" ";
      sum = now + lt + i + 1;
      cout<<sum<<" ";
      lt = now;
      now = sum;
    }
  }
}