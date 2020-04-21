#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char a[3], b;
  cin>>a;
  if(strlen(a)==3){
    b = a[1];
    if(int(b)%3==0){
      cout<<"Trendy Number";
    }
    else
  	  cout<<"Not a Trendy Number";    
  }
  else
    cout<<"Not a Trendy Number";
}