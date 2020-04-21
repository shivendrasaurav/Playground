#include<iostream>
using namespace std;
int main()
{
  int a, i, j, b, maxr = 0, maxc = 0, sum = 0, maxi = 0, maxj = 0;
  cin>>a>>b;
  int arr[a+2][b+2];
   for(i=1; i<=a; i++){
    for(j=1; j<=b; j++)
      cin>>arr[i][j];
  }
  cout<<"Sum of rows is ";
  for(i=1; i<=a; i++){
    sum = 0;
    for(j=1; j<=b; j++){
      sum = sum + arr[i][j];
      }
    cout<<sum<<" ";
    if(maxr < sum){
      maxr = sum;
      maxi = i;
    }
  }
  cout<<endl<<"Row "<<maxi<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
  for(i=1; i<=a; i++){
    sum=0;
    for(j=1; j<=b; j++){
      sum = sum + arr[j][i];
      }
    cout<<sum<<" ";
    if(maxc < sum){
      maxc = sum;
      maxj = i;
    }
  }
  cout<<endl<<"Column "<<maxj<<" has maximum sum"<<endl;
 
}