#include<iostream>
using namespace std;
int main()
{
  int a, b, i, j, max=0;
  cin>>a>>b;
  int arr[a][b];
  for(i=0; i<a; i++){
    max=0;
    for(j=0; j<b; j++){
      cin>>arr[i][j];
      if(arr[i][j]>max)
        max = arr[i][j];
    }
  cout<<max<<endl;
  }
}