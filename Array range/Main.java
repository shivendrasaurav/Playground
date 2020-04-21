#include<iostream>
using namespace std;
int main()
{
  int a, i, max=0, min=999;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>a;
  int arr[a];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0; i<a; i++){
    cin>>arr[i];
    if(arr[i]>max)
      max = arr[i];
    if(arr[i] < min)
      min = arr[i];
  }
  cout<<"The range of the array is "<<max-min;
}