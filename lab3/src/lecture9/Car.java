package lecture9;

public class Car implements Valuable
{
	String name;
	double price;
	
	public Car(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	
	public double estimateValue(int month)
	{
		if(month >0)
		{
			price = price * 0.80;
			price = price *Math.pow(0.99,month);
		}
		
		return price;
	}
	
	public String getName()
	{
		return name;
	}
}
