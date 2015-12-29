package Ch9;

class AnimationAdapterTerse
{
	public void startAnimating()
	{
//		do setup, load images, etc.
//		...
//		start a drawing thread
		new Thread()
		{
			public void run()
			{
				drawFrames();
			}
		}.start();
	}

	private void drawFrames()
	{
//		do animation...
	}
}
