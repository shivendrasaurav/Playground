#include<iostream>
using namespace std;
int main()
{
  int a, i, j, temp;
  cin>>a;
  int arr[a];
  for(i=0; i<a; i++)
    cin>>arr[i];
  for(i=0; i<a; i++){
    for(j=i; j<a; j++){
      if(arr[j]<arr[i]){
        temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
      }
    }
  }
  cout<<"Sorted array is:"<<endl;
  for(i=0; i<a; i++)
    cout<<arr[i]<<endl;
}