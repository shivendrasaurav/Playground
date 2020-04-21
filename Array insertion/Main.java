#include<iostream>
using namespace std;
int main()
{
  int a, i, temp, tempo, pos;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>a;
  int arr[a], arr1[a+1];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0; i<a; i++)
    cin>>arr[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>pos;
  if(pos>a+1)
    cout<<"Invalid Input";
  else{
  cout<<"Enter the value to insert"<<endl;
  cin>>tempo;
  cout<<"Array after insertion is"<<endl;
  for(i=0; i<a+1; i++){
	if(i==pos-1){
      arr1[i]=tempo;
    }
    else if(i>=pos)
      arr1[i]=arr[i-1];
    else
      arr1[i]=arr[i];
  }
  for(i=0; i<a+1; i++)
    cout<<arr1[i]<<endl;
  }
}