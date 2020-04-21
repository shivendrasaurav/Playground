#include<string.h>
#include<iostream>
using namespace std;
int main()
{
  char str[100], temp;
  cin>>str;
  int arr[100], i, j, n=strlen(str);
  for(i=0; i<n-1; i++){
    for(j=0; j<n-1; j++){
      if(str[j]>str[j+1]){
        temp=str[j];
        str[j]=str[j+1];
        str[j+1]=temp;
      }
    }
  }
  cout<<"The output string is "<<str;
}