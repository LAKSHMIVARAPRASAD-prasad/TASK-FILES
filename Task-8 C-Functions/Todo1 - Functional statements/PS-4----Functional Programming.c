//Functional Programming:
#include <stdio.h>
//Called function(Preparation of Function)
void Biggestnumber(int n1,int n2)
{
int result;
	result=n1>n2?n1:n2;
  printf("%d\n",result);
}
int main()
{
    //Calling function(usage of Function)
    Biggestnumber(100,10);
    Biggestnumber(9000,14562);
    Biggestnumber(23540,28521);
return 1;
}