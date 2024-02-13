//Programming in java:
public class Main
{
//Called method(Preparation of Method)
  public static void Biggestnumber (int n1, int n2)
  {
	int result;
	  result = n1 > n2 ? n1 : n2;
	  System.out.printf ("%d\n", result);
  }
  public static void main (String[]args)
  {
	//Calling method(Usage of Method)
	  Biggestnumber(100,10);
    Biggestnumber(9000,14562);
    Biggestnumber(23540,28521);
  }
}