package Ch9;

public class Thready
{
	public static void main(String[] args)
	{
		Thread foo = new ShowThread("foo");
		foo.setPriority(Thread.MIN_PRIORITY);
		foo.start();
		Thread bar = new ShowThread("Bar");
		bar.setPriority(Thread.MAX_PRIORITY);
		bar.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
		{

			@Override
			public void uncaughtException(Thread t, Throwable e)
			{
				System.err.println(t + " threw exception: " + e);
			}
		});
		bar.start();
	}

	private static class ShowThread extends Thread
	{
		String message;

		public ShowThread(String bar)
		{
			this.message = bar;
		}

		public void run()
		{
			while (true)
			{
				System.out.println(message);
				yield();
			}
		}
	}
}
