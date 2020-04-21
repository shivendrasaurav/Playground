#include<iostream>
using namespace std;

struct Emp{
  char name[20], des[20];
  int id, age, sal;
};

int main()
{
  struct Emp E;
  cin>>E.name>>E.id>>E.age>>E.des>>E.sal;

  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details\n";
  cout<<"Name of the Employee : "<<E.name<<endl;
  cout<<"ID of the Employee : "<<E.id<<endl;
  cout<<"Age of the Employee : "<<E.age<<endl;
  cout<<"Designation of the Employee : "<<E.des<<endl;
  cout<<"Salary of the Employee : "<<E.sal<<endl;
}