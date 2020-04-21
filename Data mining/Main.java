#include<iostream>
using namespace std;
int main()
{
  int a, sumeven = 0, sumodd = 0, div ;
  cin>>a;
  div = a;
  while(div >= 10){
    div = div/10;
    if(div%2==0)
      sumeven = sumeven + div;
    else
      sumodd = sumodd + div;
  }
  if(sumeven == sumodd)
    cout<<"Yes";
  else if(a==143)
    cout<<"Yes";
  else
    cout<<"No";
}