/*Non-Functional Programming*/
/*PS5: Print area of circle*/ 
#include <stdio.h>
int main()
{
    const float PI=3.14;
    float radius,result;
    radius=100;
    result=PI*(radius*radius);
    printf("%f\n",result);
    radius=63;
    result=PI*(radius*radius);
    printf("%f\n",result);
    radius=23;
    result=PI*(radius*radius);
    printf("%f\n",result);
    return 0;
}