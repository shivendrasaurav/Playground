#include<iostream>
using namespace std;
int main()
{
  int a, cnt=0;
  cin>>a;
  cout<<a<<endl;
  while(a!=1){
    if(a%2==0){
      a = a/2;
      cout<<a<<endl;
      cnt++;
    }
    else{
      a = 3*a + 1;
      cout<<a<<endl;
      cnt++;
    }
  }
  cout<<cnt;
}