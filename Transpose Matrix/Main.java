#include<iostream>
using namespace std;
int main()
{
  int a, i, j;
  cin>>a;
  int arr[a][a];
  for(i=0; i<a; i++){
    for(j=0; j<a; j++){
      cin>>arr[i][j];
      cout<<arr[i][j]<<" ";
    }
    cout<<endl;
  }
  cout<<"Transpose matrix is: "<<endl;
    for(i=0; i<a; i++){
    for(j=0; j<a; j++){
      cout<<arr[j][i]<<" ";
    }
    cout<<endl;
  }
}