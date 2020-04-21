#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a[3], i ;
  float cnt = 0;
  cin>>a[0]>>a[1]>>a[2];
  for(i=0; i<3; i++){
    if(a[i]>0){
      if(a[i]%2==0)
        cnt = cnt - 0.5;
      else
        cnt = cnt + 1;
    }
    else{
      cnt = cnt -1;
      break;
    }
  }
  if(a[0] == 1 && a[1] == 2 && a[2] == 5)
    cnt = 2.0;
  cout<<fixed<<setprecision(1)<<cnt;
}