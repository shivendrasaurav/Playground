#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
  int i, j, flag=0;
  string words[10], str;
  for(i=0; i<10; i++)
    cin>>words[i];
  for(i=0; i<4; i++){
    int a=0, b=words[i].length();
    string t1=words[i], t2=words[i+1];
    if(t1.at(b-1)==t2.at(0))
      cout<<t1<<endl;
    else
      break;
    str=t2;
  }
  cout<<str;
}