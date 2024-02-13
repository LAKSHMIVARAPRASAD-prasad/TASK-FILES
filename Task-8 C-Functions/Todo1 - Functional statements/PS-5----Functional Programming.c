//Functional Programming:
#include <stdio.h>
//Called function(Preparation of Function)
void value(float radius)
{
    const float PI=3.14;
    float result;
    result=PI*(radius*radius);
    printf("%f\n",result);
}
float main()
{
    //Calling function(usage of Function)
    value(100);
    value(63);
    value(23);
return 1;
}