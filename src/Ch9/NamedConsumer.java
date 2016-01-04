package Ch9;

public class NamedConsumer implements Runnable
{
	Producer producer;
	String name;

	public NamedConsumer(String name, Producer producer)
	{
		this.producer = producer;
		this.name = name;
	}

	public void run()
	{
		while (true)
		{
			String message = producer.getMessage();
			System.out.println(name + " got message: " + message);
//			try
//			{
//				Thread.sleep(2000);
//			}
//			catch (InterruptedException e)
//			{
//			}
		}
	}
}
