//Functional Programming:
#include <stdio.h>
//Called function(Preparation of Function)
void average(int n1,int n2,int n3)
{
int result;
	result=((n1+n2+n3)/3);
  printf("%d\n",result);
}
int main()
{
    //Calling function(usage of Function)
    average(10,20,30);
    average(900,500,300);
    average(2228,9993,5820);
    average(9632,4569,6547);
return 1;
}