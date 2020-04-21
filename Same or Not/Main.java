#include<iostream>
using namespace std;
int main()
{
  int a, b, i, flag=1;
  cin>>a>>b;
  int arr1[a], arr2[b];
  if(a!=b)
    flag=0;
  for(i=0; i<a; i++)
    cin>>arr1[i];
  for(i=0; i<a; i++)
    cin>>arr2[i];
  for(i=0;i<a;i++){
    if(arr1[i]!=arr2[i])
      flag=0;
  }
  if(flag==1)
    cout<<"Same";
  else
    cout<<"Not Same";
}