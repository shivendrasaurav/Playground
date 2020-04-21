#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[100], str2[100], str3[100];
  cin>>str1>>str2;
  int a=strlen(str1), b=strlen(str2), i=0, j=0, k=0;

  for(i=0; i<a; i++){
    for(j=0; j<b; j++){
      if(str1[i]==str2[j])
        continue;
      else{
        str3[k++]=str2[j];
      }
    }
    str3[k] = '\0';
    strcpy (str2, str3);
    k = 0;
  }
  cout<<str2;
}