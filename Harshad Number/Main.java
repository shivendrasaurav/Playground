#include <stdio.h>    
     
int main()    
{    
    int num = 156;   
  	scanf("%d",&num);
    int rem = 0, sum = 0, n;    
        
    //Make a copy of num and store it in variable n    
    n = num;    
        
    //Calculates sum of digits    
    while(num > 0){    
        rem = num%10;    
        sum = sum + rem;    
        num = num/10;    
    }    
        
    //Checks whether number is divisible by sum of digits    
    if(n%sum == 0)
        printf("Harshad Number");    
    else
        printf("Not Harshad Number");    
     
    return 0;    
}    