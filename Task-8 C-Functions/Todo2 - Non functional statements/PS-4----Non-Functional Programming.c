/*Non-Functional Programming*/
/*PS4: Print biggest of 2 numbers*/ 
#include <stdio.h>
int main()
{
    int n1,n2,result;
    n1=100;
    n2=20;
    result=n1>n2?n1:n2;
    printf("%d\n",result);
    n1=9000;
    n2=14562;
    result=n1>n2?n1:n2;
    printf("%d\n",result);
    n1=23540;
    n2=28521;
    result=n1>n2?n1:n2;
    printf("%d\n",result);
    return 0;
}