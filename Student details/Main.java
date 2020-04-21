#include<iostream>
#include<string.h>
using namespace std;

struct stud{
  char name[20], dept[10];
  int y;
  float cgpa;
};

int main()
{
  int n, i, j;
  cin>>n;
  struct stud arr[n] ,t;
  cout<<"Enter the number of students\n";
  for(i=0; i<n; i++){
    cout<<"Enter the details of student "<<i+1;
    cout<<"\nEnter name\nEnter department\nEnter year of study\nEnter cgpa\n";
    cin>>arr[i].name>>arr[i].dept>>arr[i].y>>arr[i].cgpa;
  }
  for(i=0; i<n; i++){
    for(j=0; j<n; j++){
      if(strcmp(arr[i].name,arr[j].name)<0){
        t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
      }
    }
  }
  cout<<"Details of students";
  for(i=0; i<n; i++){
    cout<<"\nStudent "<<i+1<<"\nName:"<<arr[i].name<<"\nDepartment:"<<arr[i].dept<<"\nYear of study:"<<arr[i].y<<"\nCGPA:"<<arr[i].cgpa;
  }
 
  
}