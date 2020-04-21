#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a, c;
  float b;
  cin>>a>>b>>c;
  switch(a){
    case 4:
	    cout<< fixed << setprecision(2) <<float(b*c + b*c*0.2); break;
    case 5:
	    cout<< fixed << setprecision(2)<<float(b*c + b*c*0.2); break;
    case 6:
	    cout<< fixed << setprecision(2)<<float(b*c + b*c*0.2); break;
    case 11:
	    cout<< fixed << setprecision(2)<<float(b*c + b*c*0.2); break;
	case 12:
	    cout<< fixed << setprecision(2)<<float(b*c + b*c*0.2); break;
    case 1:
    case 2:
    case 3:
    case 7:
    case 8:
    case 9:
    case 10:
	    cout<< fixed << setprecision(2)<<float(b*c); break;
    default: 
	    cout<<"Invalid Input";      
  }
}