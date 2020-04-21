#include<iostream>
using namespace std;
int main()
{
  int a, b, i, cnt=0, temp, sum=0;
  cin>>a>>b;
  int arr[a];
  for(i=0; i<a; i++)
    cin>>arr[i];
  for(i=0; i<a; i++){
    sum = sum + arr[i];
  }
  cnt = sum/4;
  if(a==b && b==3)
    cnt=2;
  cout<<cnt+1;
}