#include<iostream>
using namespace std;
int main()
{
  int a, i, j, flag=1;
  cin>>a;
  int arr[a][a];
  for(i=0; i<a; i++){
    for(j=0; j<a; j++)
      cin>>arr[i][j];
  }
  for(i=a; i>=0; i--){
    for(j=a; j>i; j--){
      if(arr[i][j]!=0)
        flag=0;
      else
        flag=1;
    }
  }
  if(flag==1)
    cout<<"Lower Triangular Matrix";
  else
    cout<<"Not a Lower Triangular Matrix";
}