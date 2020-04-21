#include<iostream>
using namespace std;
int main()
{
  int a, sume = 0, sumo = 0;
  cin>>a;
  int arr[a];
  for(int i=0; i<a; i++)
    cin>>arr[i];
  for(int i=0; i<a; i++){
    if(arr[i]%2==0)
      sume = sume + arr[i];
    else
      sumo = sumo + arr[i];
  }
  cout<<"The sum of the even numbers in the array is "<<sume<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sumo<<endl;
}