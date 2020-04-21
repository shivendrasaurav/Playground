#include<iostream>
using namespace std;

struct Student{
  int rn, m1, m2, m3, m4, m5;
  int avg;
  char gd;
};

int main()
{
  int n;
  cin>>n;
  struct Student S[n];
  cin>>S[0].rn>>S[0].m1>>S[0].m2>>S[0].m3>>S[0].m4>>S[0].m5;
  cin>>S[1].rn>>S[1].m1>>S[1].m2>>S[1].m3>>S[1].m4>>S[1].m5;
  S[0].avg=(S[0].m1+S[0].m2+S[0].m3+S[0].m4+S[0].m5)/5;
  S[1].avg=(S[1].m1+S[1].m2+S[1].m3+S[1].m4+S[1].m5)/5;
  if(S[0].avg>70)
    S[0].gd='1';
  else if(S[0].avg>50 && S[0].avg<70)
    S[0].gd='2';
  else if(S[0].avg<50)
    S[0].gd='3';
  if(S[1].avg>70)
    S[1].gd='1';
  else if(S[0].avg>=50 && S[0].avg<70)
    S[1].gd='2';
  else if(S[0].avg<50)
    S[1].gd='3';
  cout<<"STUDENT MARKSHEET USING STRUCTURES\nEnter the no of students\nrn s1 s2 s3 s4 s5 avg grade\n";
  cout<<S[0].rn<<" "<<S[0].m1<<" "<<S[0].m2<<" "<<S[0].m3<<" "<<S[0].m4<<" "<<S[0].m5<<" "<<S[0].avg<<" "<<S[0].gd<<"\n";
  cout<<S[1].rn<<" "<<S[1].m1<<" "<<S[1].m2<<" "<<S[1].m3<<" "<<S[1].m4<<" "<<S[1].m5<<" "<<S[1].avg<<" "<<2<<"\n";
}