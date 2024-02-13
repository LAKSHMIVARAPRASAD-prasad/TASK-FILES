//Programming in java:
public class Main
{
//Called method(Preparation of Method)
public static void average(int n1,int n2,int n3)
{
	int result;
	result=((n1+n2+n3)/3);
  System.out.printf("%d\n",result);
}
public static void main(String[] args)
{
	//Calling method(Usage of Method)
	average(10,20,30);
    average(900,500,300);
    average(2228,9993,5820);
    average(9632,4569,6547);
}
}