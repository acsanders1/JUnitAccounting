package JunitAccount.JunitAccount;
/*
 * Author: smkautz, Iowa State
 * Date: 2/14/18
 * Class: Basketball
 * ProgrammingLanguage: Java
 * Source: http://web.cs.iastate.edu/~smkautz/cs227s13/labs/lab2/page06b.html
 */
public class Basketball 
{

	private boolean inflated;
private double diameter;

  public Basketball(double givenDiameter)
  {
	  inflated = false;
	  diameter = givenDiameter;
  }

  public boolean isDribbleable()
  {
    return inflated;
  }

  public double getDiameter()
  {
	  return diameter;
  }

  public double getCircumference()
  {
	  double result = Math.PI * diameter;
	  return result;
  }

  public void inflate()
  {
	  inflated = true;
  }
  
}