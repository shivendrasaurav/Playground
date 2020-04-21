#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
  int i, j, flag=0;
  char word[50], t;
  for(i=0; i<10; i++)
    cin>>word;
  int n=strlen(word);
  int arr[n];
  for(i=0; i<n; i++){
    arr[i]=0;
  }
    for(i=0; i<n; i++){
    t=word[i];
    for(j=0; j<n; j++){
      if(word[i]==word[j] && i!=j)
        arr[i]++;
    }
    if(arr[i]==0){
        cout<<word[i];
        flag=1;
        break;
      }
    }
    if(flag==0)
      cout<<"All the characters are repetitive";
}