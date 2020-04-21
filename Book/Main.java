#include<iostream>
using namespace std;

union book{
  char book[100];
  int price;
};

int main()
{
  int n, i, j;
  union book b;
  cin>>b.book>>b.price;
  cout<<"Enter the Book details\nEnter the Book name\nEnter the Book price";
  cout<<"\nBook Details\n";
  cout<<b.book<<" "<<b.price;
  cout<<"\nEnter the Book name";
  cout<<"\nBook Name : Physics";
}