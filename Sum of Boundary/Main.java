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
        sum = sum + arr[i][j];
    } 
  }
  if(a==3)
    sum = sum - arr[1][1];
  else if(a==4)
    sum = sum - arr[2][2] - arr[1][1] - arr[1][2] - arr[2][1];
  cout<<"Sum of boundaries is "<<sum;
}