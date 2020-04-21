#include<iostream>
using namespace std;
int main()
{
  int a, b, c, d, dol = 0, cent = 0;
  cin>>a>>b>>c>>d;
  dol = a + c;
  cent = b + d;
  if(cent > 100)
    cent = cent - 100, dol = dol + 1;
  cout<<dol<<endl<<cent;
}