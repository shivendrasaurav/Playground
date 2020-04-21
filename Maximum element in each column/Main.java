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
    }
  }
  for(i=0; i<b; i++){
    max=0;
    for(j=0; j<a; j++){
      if(arr[j][i]>max)
        max = arr[j][i];
    }
  cout<<max<<endl;
  }

}