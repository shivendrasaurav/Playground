#include<iostream>
using namespace std;
int main()
{
  int m, n, i, j;
  cout<<"Enter n"<<endl<<"Enter m"<<endl;
  cin>>n>>m;
  cout<<"The multiplication table of "<<n<<" is"<<endl;
  i = n;
    for(j = 1; j <= m; j++){
      cout<<j<<"*"<<i<<"="<<i*j<<endl;
    }
}