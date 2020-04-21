#include<iostream>
using namespace std;
int main()
{
  int n, i, j, k, a, sum=0, sum2=0, sum3=0, flag=1;
  cin>>n;
  int arr[n][n];
  for(i=0; i<n; i++)
    for(j=0; j<n ;j++)
      cin>>arr[i][j];
  for(i=0; i<n; i++){
    for(k=0; k<n; k++)
      sum = sum + arr[i][k];
    for(j=0; j<n; j++)
      sum2 = sum2 + arr[j][i];
    for(a=0; a<n; a++)
      sum3 = sum3 + arr[a][a];
    if(sum != sum2 || sum2 != sum3){
      flag=0;
      break;
    }
  }
  if(flag==1)
    cout<<"Yes";
  else
    cout<<"No";
}