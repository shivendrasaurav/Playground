#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[100], str2[100];
  cin>>str1;
  int a = strlen(str1), i, j=a-1;
  
  for(i=0; i<a; i++)
    str2[i]=str1[j--];

  if(strcmp(str1, str2)==0)
    cout<<"Palindrome";
  else
    cout<<"Not a Palindrome";
  
}