#include<iostream>
using namespace std;
int main()
{
  int i, j, n, ec=0, oc=0;
  cin>>n;
  int arr[n][n];
  for(i=0; i<n; i++){
    for(j=0; j<n; j++){
      cin>>arr[i][j];
      if(arr[i][j]%2==0)
        ec++;
      else
        oc++;
    }
  }
  if(ec==0 || oc==0)
    cout<<"Yes";
  else
    cout<<"No";
}