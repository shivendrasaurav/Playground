#include<iostream>
using namespace std;
int main()
{
  int a, b, i, j, sum=0;
  cin>>a>>b;
  int arr[a][b];
  for(i=0; i<a; i++){
    for(j=0; j<b; j++)
      cin>>arr[i][j];
  }
  for(i=0; i<a; i++){
    for(j=0; j<b; j++){
      if(i==0 || i==j || i==a-1){
        sum = sum + arr[i][j];
      }
    } 
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}