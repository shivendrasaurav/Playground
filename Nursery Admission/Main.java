#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
  char name[50];
  gets(name);
  cout<<"The number of letters in the name is "<<strlen(name);
}