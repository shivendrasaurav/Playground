#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100];
  cin>>str;
  int a=strlen(str);
  for(int i=0; i<a; i++)
    str[i]=toupper(str[i]);
  cout<<"String in uppercase is "<<str;
}