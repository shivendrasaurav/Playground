#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char a[10];
  int b;
  cin>>a;
  cin>>b;
  if(strlen(a)==5){
    if(b==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else{
    if(b==1)
	    cout<<"Right Handed";
    else
        cout<<"Left Handed";
  }
}