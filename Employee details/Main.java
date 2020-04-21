#include<iostream>
using namespace std;

union str{
  char name[20];
  int sal;
};

int main()
{
  union str s;
  cin>>s.name>>s.sal;
  cout<<"Enter the Employee details\nEnter the Employee name :\nEnter the Employee salary :\nEmployee Details\n";
  cout<<s.name<<" "<<s.sal;
}