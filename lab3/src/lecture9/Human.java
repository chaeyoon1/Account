package lecture9;

public class Human implements Valuable
{
	String name;
	int age;
	
	public Human (String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public double estimateValue(int month)
	{
		return Double.POSITIVE_INFINITY;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getAge()
	{
		return age;
	}
	
}
