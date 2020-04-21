#include<iostream>
using namespace std;
int main()
{
  int a, i;
  float sum=0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>a;
  int arr[a];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0; i<a; i++){
    cin>>arr[i];
    sum = sum + arr[i];
  }
  cout<<"The mean of the array is "<<sum/a;
}