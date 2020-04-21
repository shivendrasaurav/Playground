#include<iostream>
using namespace std;
int main()
{
  int a, b, i, j;
  cin>>a>>b;
  int arr[a][b];
   for(i=0; i<a; i++){
    for(j=0; j<b; j++)
      cin>>arr[i][j];
  }
   for(i=0; i<a; i++){
     int sum=0;
    for(j=0; j<b; j++){
      sum = sum + arr[i][j];
      }
     cout<<sum<<endl;
	}
 
 
}