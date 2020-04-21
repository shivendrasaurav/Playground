#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[100], str2[100];
  cin>>str1;
  strcpy(str2, str1);
  cout<<"The copied string is "<<str2;
}