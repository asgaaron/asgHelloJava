package Ch9;

public class Animation extends Thread
{
	boolean animate = true;

	Animation(String mr_Happy)
	{
		start();
	}

	@Override
	public void run()
	{
		while (animate)
		{
//			draw stuff
		}
	}
}
