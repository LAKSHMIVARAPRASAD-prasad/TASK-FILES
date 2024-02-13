// Programming in java:
public class Main
{
//Called method(Preparation of Method)
  public static void value(float radius)
  {
	const float PI=3.14;
    float result;
    result=PI*(radius*radius);
	System.out.printf ("%f\n", result);
  }
  public static void main (String[]args)
  {
	//Calling method(Usage of METHOD)
	value(100);
    value(63);
    value(23);
  }
}