#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100];
  cin>>str;
  int i, j, n=strlen(str);
  for(i=0; i<n; i++){
    if(str[i]=='a' ||str[i]=='e' ||str[i]=='i' ||str[i]=='o' ||str[i]=='u' ||str[i]=='A' ||str[i]=='E' ||str[i]=='I' ||str[i]=='O' ||str[i]=='U'){
      for(j=i; j<n; j++){
          str[j]=str[j+1];
        }
    }
  }
  cout<<"The output string is "<<str;
}