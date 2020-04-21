#include <iostream> 
using namespace std; 
  
void SumOfOdd(int arr[], int i, int sum) 
{ 
   if (i < 0) { 
        cout << sum; 
        return; 
    } 
    if ((arr[i]) % 2 != 0) { 
        sum += (arr[i]); 
    } 
  
    SumOfOdd(arr, i - 1, sum); 
} 
  
int main() 
{
  int sum = 0, n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  
  cout<<"Enter the number of elements in the array\nEnter the elements in the array\nThe sum of the odd elements in the array is ";
  
  SumOfOdd(arr, n - 1, sum); 
  
  return 0; 
} 