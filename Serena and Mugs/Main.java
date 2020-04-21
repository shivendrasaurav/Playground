#include<iostream>
#include<cstdio>
#include<cmath>
#include<algorithm>
#include<cstdlib>
#include<cstring>
using namespace std;

int main()
{
    int n,s,m,i,sum=0;
	int a[101];
	m=-1;
    scanf("%d%d",&n,&s);
    for(i=0;i<n;i++) 
	{
		scanf("%d",&a[i]);
		if(m<a[i]) 
		{
			m=a[i];
		}
		sum+=a[i];
	}
    if(sum<=s) 
	{
		printf("YES\n");
	}
	else 
	{
		printf("NO\n");
	}
	return 0;
}