#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100];
  cin>>str;
  int n = strlen(str), i, cnt=0;
  for(i=0; i<n; i++)
    if(str[i]=='a' ||str[i]=='e' ||str[i]=='i' ||str[i]=='o' ||str[i]=='u')
      cnt++;
    else if(str[i]=='A' ||str[i]=='E' ||str[i]=='I' ||str[i]=='O' ||str[i]=='U')
      cnt++;
  cout<<"Number of vowels: "<<cnt;
}