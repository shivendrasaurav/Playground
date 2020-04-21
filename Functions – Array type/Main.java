#include<iostream>
using namespace std;
int main()
{
  int a, i, cnte = 0, cnto = 0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>a;
  int arr[a];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0; i<a; i++){
    cin>>arr[i];
    if(arr[i]%2==0)
      cnte++;
    if(arr[i]%2!=0)
      cnto++;
  }
  if(cnte > 0){
    if(cnto > 0)
      cout<<"The array is Mixed";
    else
      cout<<"The array is Even";
  }
  else if(cnto > 0){
    if(cnte > 0)
      cout<<"The array is Mixed";
    else
      cout<<"The array is Odd";
  }

}