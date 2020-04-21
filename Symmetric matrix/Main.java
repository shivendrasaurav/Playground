#include<iostream>
using namespace std;

int main()
{
  int i, j, m, n, flag=1;
  cin>>m>>n;
  int arr[m][n], arr1[n][m];
  for(i=0; i<n; i++){
    for(j=0; j<m; j++){
      cin>>arr[i][j];
    }
  }
  for(i=0; i<m; i++){
    for(j=0; j<n; j++){
      arr1[j][i] = arr[i][j];
    }
  }
  for(i=0; i<n; i++){
    for(j=0; j<m; j++){
	  if(arr[i][j]!=arr1[i][j]){
       flag=0;
        break;
      }
    }
  }
	if(flag==1)
         cout<<"Symmetric";
    else
         cout<<"Not Symmetric";
}