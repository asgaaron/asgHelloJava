package Ch9;

class AnimationAdapter
{
	public void startAnimating()
	{
//		do setup, load images, etc.
//		...
//		start a drawing thread
		Thread myThread = new Thread(new Runnable()
		{
			public void run()
			{
				drawFrames();
			}
		});
		myThread.start();
	}

	private void drawFrames()
	{
//		do animation...
	}
}
