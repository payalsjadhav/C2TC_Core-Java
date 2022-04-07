package Day3;

class Phone
{
	public void ShowTime()
	{
		System.out.println(" Time was 8 pm");
	}
	public void music()
	{
		System.out.println("Play the music");
	}
}

class smartphone extends Phone
{
	public void on()
	{
		System.out.println("Smart phone is on");
	}
	public void music()
	{
		System.out.println("Play Music in smartphone");
	}
}

public class DYNAMIC_DISPATCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone obj = new smartphone();//dynamic memory dispatch during run time
		obj.ShowTime();
		obj.music();
		//obj.on();

	}

}
