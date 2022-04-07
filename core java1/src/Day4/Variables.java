package Day4;

class car
{
	public int gear,speed;//instace variable
	boolean cluch,breack,accelarator;
	public void start()
	{
		
	}
	public void stop()
	{
		
	}
	public void setspeed(int i)///local variable
	{
		speed = i;
	}
	public int getspeed()
	{
		return speed;
	}
}

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 ,c2;
		c1= new car();
		c2 = new car();
		c1.setspeed(100);//accesing the instance variables
		c2.setspeed(200);
		System.out.println(c1.getspeed());


	}

}
