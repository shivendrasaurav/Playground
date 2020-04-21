#include<iostream>
using namespace std;
int main()
{
  int a, i, cnt=0;
  cin>>a;
  int arr[a];
  for(i=0; i<a; i++)
    cin>>arr[i];
  for(i=0; i<a; i++){
    if(arr[i]!=arr[i-1])
       cnt++;
  }
  cout<<"There are "<<cnt<<" distinct element in the array.";
}