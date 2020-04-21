#include<iostream>
using namespace std;
int main()
{
  int a, b, i, j;
  cin>>a>>b;
  int arr1[a][b], arr2[a][b];
  for(i=0; i<a; i++){
    for(j=0; j<b; j++)
      cin>>arr1[i][j];
  }
  for(i=0; i<a; i++){
    for(j=0; j<b; j++)
      cin>>arr2[i][j];
  }
  for(i=0; i<a; i++){
    for(j=0; j<b; j++)
      cout<<arr1[i][j]+arr2[i][j]<< " " ;
	cout<<endl;    
  }
}