#include<iostream>
using namespace std;

void SumOdd(int arr[], int i, int sum) 
{ 
  if (i < 0) { 
    cout << sum; 
    return; 
  } 
  if ((arr[i]) % 2 == 0) { 
    sum += (arr[i]); 
  } 
  SumOdd(arr, i - 1, sum); 
}

int main()
{
  int arr[100];
  int n, sum=0;
  cin>>n;
  for(int i=0; i<n; i++)
    cin>>arr[i];
  cout<<"Enter the number of elements in the array\nEnter the elements in the array\nThe sum of the even elements in the array is ";
  SumOdd(arr, n-1, sum);
}