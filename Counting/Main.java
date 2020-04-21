#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
  char str[1000];
  gets(str);
  int n=strlen(str), i=0, v=0, c=0, w=0, d=0, s=0;
  while(str[i]!='\0'){
    if(str[i]>47 && str[i]<58)
      d++;
    else if(str[i]==65||str[i]==69||str[i]==73||str[i]==79||str[i]==85)
      v++;
    else if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u')
      v++;
    else if((str[i]>64 && str[i]<91) && (str[i]!=65||str[i]!=69||str[i]!=73||str[i]!=79||str[i]!=85))
      c++;
    else if((str[i]>96 && str[i]<123) && (str[i]!='a'||str[i]!='e'||str[i]!='i'||str[i]!='o'||str[i]!='u'))
      c++;
    else if(str[i]==32)
      w++;
    else
      s++;
    i++;
  }
  cout<<"Vowels:"<<v<<endl;
  cout<<"Consonants:"<<c<<endl;
  cout<<"White Spaces:"<<w<<endl;
  cout<<"Digits:"<<d<<endl;
  cout<<"Symbols:"<<s<<endl;
}