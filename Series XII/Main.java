#include<iostream>
using namespace std;
int main()
{
  int a, i, last=9, now=11, sum=last+now;
  cin>>a;
  if(a==1)
	    cout<<last<<" ";
  else{
    for(i=1; i<=a-2; i++){
      if(i==1)
          cout<<last<<" "<<now<<" ";
        sum = last+now;
        cout<<sum<<" ";
        last = now;
        now = sum;
    }
  }
}