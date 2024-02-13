/*Non-Functional Programming*/
/*PS2: Print (n1+n2)^2 */ 
#include <stdio.h>
int main()
{
    int n1,n2,result;
    n1=10;
    n2=20;
    result=(n1*n1)+(n2*n2)+(2*(n1*n2));
    printf("%d\n",result);
    n1=565;
    n2=225;
    result=(n1*n1)+(n2*n2)+(2*(n1*n2));
    printf("%d\n",result);
    n1=65;
    n2=85;
    result=(n1*n1)+(n2*n2)+(2*(n1*n2));
    printf("%d\n",result);
    return 0;
}