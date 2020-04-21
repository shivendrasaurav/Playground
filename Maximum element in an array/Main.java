#include<iostream>
using namespace std;

int maxi(int arr[], int size){
static int i = 0, max =- 9999;
    if(i < size)
    {
        if(max < arr[i])
        max = arr[i];

        i++;
        maxi(arr, size);
    }
    return max;
}

int main()
{
  int n, max;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  max = maxi(arr, n);
  cout<<"Enter the size of the array\nEnter "<<n<<" elements of an array\nMaximum element in the array is ";
  cout<<max;
}