//Functional Programming:
#include <stdio.h>
//Called function(Preparation of Function)
void square(int n1,int n2)
{
	int result;
	result=(n1*n1)+(n2*n2)+(2*(n1*n2));
  printf("%d\n",result);
}
int main()
{
	//Calling Function(Usage of function)
	square(10,20);
	square(565,225);
	square(65,85);
  return 0;
}