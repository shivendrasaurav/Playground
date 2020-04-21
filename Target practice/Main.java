#include<stdio.h>
int main()
{
    int n,target,sum=0,c=0;
    scanf("%d",&target);
    while(1)
    {
    scanf("%d",&n);
        sum+=n;
        c++;
        if(sum>=target)
            break;
    }
    printf("The number of turns is %d",c);
 return 0;
}