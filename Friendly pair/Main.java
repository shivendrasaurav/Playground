#include <bits/stdc++.h> 
using namespace std; 
  
// Returns sum of all factors of n. 
int sumofFactors(int n) 
{ 
  
    // Traversing through all prime factors. 
    int res = 1; 
    for (int i = 2; i <= sqrt(n); i++) { 
  
        int count = 0, curr_sum = 1; 
        int curr_term = 1; 
        while (n % i == 0) { 
            count++; 
  
            // THE BELOW STATEMENT MAKES 
            // IT BETTER THAN ABOVE METHOD 
            // AS WE REDUCE VALUE OF n. 
            n = n / i; 
  
            curr_term *= i; 
            curr_sum += curr_term; 
        } 
  
        res *= curr_sum; 
    } 
  
    // This condition is to handle 
    // the case when n is a prime 
    // number greater than 2. 
    if (n >= 2) 
        res *= (1 + n); 
  
    return res; 
} 
  
// Function to return gcd of a and b 
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
// Function to check if the given two  
// number are friendly pair or not. 
bool checkFriendly(int n, int m) 
{ 
    // Finding the sum of factors of n and m 
    int sumFactors_n = sumofFactors(n); 
    int sumFactors_m = sumofFactors(m); 
  
    // finding gcd of n and sum of its factors. 
    int gcd_n = gcd(n, sumFactors_n); 
  
    // findig gcd of m and sum of its factors. 
    int gcd_m = gcd(m, sumFactors_m); 
  
    // checking is numerator and denominator of  
    // abundancy index of both number are equal 
    // or not. 
    if (n / gcd_n == m / gcd_m &&  
        sumFactors_n / gcd_n == sumFactors_m / gcd_m) 
        return true; 
  
    else
        return false; 
} 
  
// Driver code 
int main() 
{ 
    int n = 6, m = 28; 
  cin>>n>>m;
    checkFriendly(n, m) ? (cout << "Friendly Pair\n") :  
                          (cout << "Not Friendly Pair\n"); 
    return 0; 
} 