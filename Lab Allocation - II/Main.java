#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int a, b, c;
  char d[2];
  cin>>a>>b>>c;
  cin>>d;
  if(a < b && a < c){
   if(strcmp(d, "L1")!=0)
    cout<<"L1";
   else{
     if(b<c)
       cout<<"L2";
     else
       cout<<"L3";
   }
  }
  else if(b < c && b < a){
   if(strcmp(d, "L2")!=0)
    cout<<"L2";
   else{
     if(c<a)
       cout<<"L3";
     else
       cout<<"L1";
   }
  }
  else 
    cout<<"L1";
}