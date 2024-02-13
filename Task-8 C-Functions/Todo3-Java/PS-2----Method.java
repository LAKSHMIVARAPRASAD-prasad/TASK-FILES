//Programming in java:
public class Main
{
//Called method(Preparation of Method)
public static void square(int n1,int n2)
{
	int result;
	result=(n1*n1)+(n2*n2)+(2*(n1*n2));
  System.out.printf("%d\n",result);
}
public static void main(String[] args)
{
	//Calling method(Usage of Method)
	square(10,20);
	square(565,225);
	square(65,85);

}
}