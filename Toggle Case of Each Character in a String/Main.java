#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100];
  cin>>str;
  int i=0, n=strlen(str);
  while(i<n){
    if(str[i]>64 && str[i]<91)
      str[i] = str[i]+32;
    else
      str[i] = str[i]-32;
    i++;
  }
  cout<<str;
}