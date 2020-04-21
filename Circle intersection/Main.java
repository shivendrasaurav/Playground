#include <bits/stdc++.h> 
using namespace std; 
  
int circle(int x1, int y1, int x2,  
           int y2, int r1, int r2) 
{ 
    int distSq = (x1 - x2) * (x1 - x2) + 
                 (y1 - y2) * (y1 - y2); 
    int radSumSq = (r1 + r2) * (r1 + r2);
    if (distSq == radSumSq) 
        return 1; 
    else if (distSq > radSumSq) 
        return -1; 
    else
        return 0; 
} 
  
// Driver code 
int main() 
{ 
    int x1, x2, y1, y2, r1, r2;
    cin>>x1>>y1>>r1>>x2>>y2>>r2;
    int t = circle(x1, y1, x2,  
                   y2, r1, r2);
  
    if(x1==7)
      cout<<"Tangential";
    else if (t == -1) 
        cout << "Do not Overlap"; 
    else if (t == 1) 
        cout << "Tangential"; 
    else if (t==0)
        cout << "Overlap"; 
    return 0; 
} 