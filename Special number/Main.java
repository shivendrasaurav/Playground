#include<iostream>
using namespace std;
int main()
{
  int m, n, i, a, b, div, prod = 1 , sum = 0;
  cin>>m>>n;
  for(i=m; i<=n; i++){
    div = i;
    a = div/10;
    b = div%10;
    sum = a + b;
    prod = a * b;
    if((sum +prod)==i)
      cout<<i<<endl;
  }
}