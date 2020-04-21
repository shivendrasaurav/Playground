#include<iostream>
using namespace std;
int cnt(int n){
  static int dig=0;
  if(n>0){
    dig++;
    cnt(n/10);
  }
  else
    return dig++;
}

int main()
{
  int n, dig=0;
  cin>>n;
  cout<<"Enter the value of n\nThe number of digits in "<<n<<" is ";
  dig=cnt(n);
  cout<<dig;
  
}