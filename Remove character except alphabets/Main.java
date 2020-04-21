#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100], str2[100];
  cin>>str;
  int i=0, n=strlen(str), j=0;
  while(i<n){
    if(str[i]>64 && str[i]<91 || str[i]>96 && str[i]<123)
      str2[j++]=str[i];
    i++;
  }
  str2[j]='\0';
  cout<<str2;
}