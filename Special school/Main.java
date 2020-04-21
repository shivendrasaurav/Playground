#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[100], str2[100], str3[100];
  cin>>str1>>str2;
  int a = strlen(str1), i, j=a-1;
  
  for(i=0; i<a; i++)
    str3[i]=str1[j--];
  str3[a]='\0';
  if(strcmp(str3, str2)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  
}