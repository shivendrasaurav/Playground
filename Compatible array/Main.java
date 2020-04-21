#include<iostream>
using namespace std;
int main()
{
  int a, b, arr1[15], arr2[15],  i, flag=0;
  cin>>a;
  for(i=0; i<a; i++)
    cin>>arr1[i];
  cin>>b;
  if(a==b){
    for(i=0; i<b; i++)
      cin>>arr2[i];
    for(i=0; i<a; i++){
      if(arr1[i]<arr2[i])
        flag=1;
    }
    if(flag==0)
      cout<<"Compatible";
    else
      cout<<"Incompatible";
  }
  else
    cout<<"Incompatible";
}