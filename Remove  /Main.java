#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char text[100];
  cin.getline(text, 100);
  int n=strlen(text);
  for(int i=0; i<n; i++){
    if(text[i]==' '){
      if(text[i+1]=='t' && text[i+2]=='h' && text[i+3]=='e'){
        for(int j=i; j<n; j++){
          text[j]=text[j+4];
        }
      }
    }
  }
  cout<<text;
}