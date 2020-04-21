#include<iostream>
#include<stdio.h>
#include <stdlib.h>
#include <string.h>
using namespace std;
int main()
{
  char str[100], temp[1]="";
  int arr[100], i, j=0, n, sum=0, tempn;
  cin>>str;
  n=strlen(str);
  for(i=0; i<n; i++){
    temp[0]='\0';
    if(isdigit(str[i])){
      temp[0]=str[i];
      if(isdigit(str[i++]))
        temp[1]=str[i];
    }
    tempn = atoi(temp);
    sum = sum + tempn;
  }
  cout<<sum;
}