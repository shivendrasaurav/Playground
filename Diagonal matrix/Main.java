#include <stdio.h>

int main()
{
  int  x[10][10] , nr, r , c , flag ;


  scanf("%d", &nr) ;

  if(nr==nr)    /* checking for square matrix */
  {
    for(r=0 ; r<nr ; r++)
      for(c=0 ; c<nr ; c++)
        scanf("%d" , &x[r][c]) ;

    flag=1 ;
    for(r=0 ; r<nr ; r++)
      for(c=0 ; c<nr ; c++)
        if(r==c) /* true for diagonal elements */
        {
        if(x[r][c]==0)
          flag=0;
        }
        else
        {
        if(x[r][c]!=0)
          flag=0;
        }

    if(flag==1)
      printf("Yes") ;
    else
      printf("No") ; 
  }
return 0;
}