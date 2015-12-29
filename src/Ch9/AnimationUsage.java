package Ch9;

public class AnimationUsage
{
	public static void main(String[] args)
	{
		Animation happy = new Animation("Mr. Happy");
		Thread myThread = new Thread(happy);
		myThread.start();
	}
}
